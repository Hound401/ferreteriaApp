package com.ferreteria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.app.entity.Empleados;
import com.ferreteria.app.service.EmpleadosService;

@RestController
@RequestMapping("/Empleados")
public class EmpleadosController {
	
	@Autowired
	private EmpleadosService empleadosService;
	
	@GetMapping
	public List<Empleados> findAll(){
		return empleadosService.findAll();
	}
	
	@GetMapping("/{idEmpleado}")
	public Empleados findById(@PathVariable("idEmpleado") Integer idEmpleado){
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
	
}
