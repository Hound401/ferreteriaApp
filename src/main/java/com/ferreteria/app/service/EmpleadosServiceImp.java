package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	public Empleados findById(Integer idEmpleado) {
		
		Optional<Empleados> empleadosO = empleadosRepository.findById(idEmpleado);
		return empleadosO.isPresent() ? empleadosO.get() : new Empleados();
	}

	@Override
	public Empleados save(Empleados empleados) {
		
		return empleadosRepository.save(empleados);
	}

	@Override
	public Empleados update(Empleados empleados) {
		
		return empleadosRepository.save(empleados);
	}
	
}
