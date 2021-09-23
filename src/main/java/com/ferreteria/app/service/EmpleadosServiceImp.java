package com.ferreteria.app.service;

import com.ferreteria.app.exception.ModeloNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;


import com.ferreteria.app.entity.Empleados;
import com.ferreteria.app.repository.EmpleadosRepository;

@Service
public class EmpleadosServiceImp implements EmpleadosService {

	@Autowired
	private EmpleadosRepository empleadosRepository;
	
	@Override
	public List<Empleados> findAll() {
		
		return empleadosRepository.findAll();
	}

	@Override
	public Empleados findById(Integer idEmpleado) throws Exception {
        Optional<Empleados> optionalEmpleado = empleadosRepository.findById(idEmpleado);
        if(!optionalEmpleado.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + idEmpleado);
        }
        return optionalEmpleado.get();
    }

	@Override
	public Empleados save(Empleados empleado) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<Empleados>> violations = validator.validate(empleado);
        if(!violations.isEmpty()){
            throw new ConstraintViolationException(violations);
        }
        /*
        * for (ConstraintViolation<User> violation : violations) {
            log.error(violation.getMessage());
        }
        * */
        Empleados emp = empleadosRepository.save(empleado);
        return emp;
    }

	@Override
	public Empleados update(Empleados empleados) {
		
		return empleadosRepository.save(empleados);
	}
	
	@Override
	public boolean deleteById(Integer idEmpleado) throws Exception {
        Optional<Empleados> optionalEmpleado = empleadosRepository.findById(idEmpleado);
        if(!optionalEmpleado.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idEmpleado);
        }
        empleadosRepository.deleteById(idEmpleado);
        return true;
    }	
	
	
	@Override
    public Page<Empleados> listarPageable(Pageable pageable) {
        return empleadosRepository.findAll(pageable);
    }
	
}
