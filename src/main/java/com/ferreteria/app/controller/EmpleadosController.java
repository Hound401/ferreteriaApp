package com.ferreteria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.ferreteria.app.entity.Empleados;
import com.ferreteria.app.service.EmpleadosService;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/Empleados")
public class EmpleadosController {
	
	private EmpleadosService empleadosService;
	
	@Autowired
    public EmpleadosController(EmpleadosService empleadosService) {
        this.empleadosService = empleadosService;
    }

	@ApiOperation(value = "Obtener todos los Empleados",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Empleados")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron empleados en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public List<Empleados> findAll(){
		return empleadosService.findAll();
	}
	
	@GetMapping("/{idEmpleado}")
	public Empleados findById(@PathVariable("idEmpleado") Integer idEmpleado) throws Exception{
		return empleadosService.findById(idEmpleado);
	}

	@PostMapping
	public @ResponseBody Empleados save(@RequestBody Empleados empleados) {
		return empleadosService.save(empleados);
		
	}
	
	@PutMapping
	public @ResponseBody Empleados update(@RequestBody Empleados empleados) {
		return empleadosService.update(empleados);
		
	}
	
	@DeleteMapping("/{idEmpleado}")
    public String deleteById(@PathVariable("idEmpleado") Integer idEmpleado) throws Exception {
		empleadosService.deleteById(idEmpleado);
        return "Empleado eliminado correctamente";
    }
	
	@GetMapping("/pageable")
    public ResponseEntity<Page<Empleados>> listarPageable(Pageable pageable) {
        Page<Empleados> pacientes = empleadosService.listarPageable(pageable);
        return new ResponseEntity<Page<Empleados>>(pacientes, HttpStatus.OK);
    }
}
