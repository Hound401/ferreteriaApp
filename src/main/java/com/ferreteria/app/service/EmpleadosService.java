package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Empleados;

public interface EmpleadosService {

	List<Empleados> findAll();
	
	Empleados findById(Integer idEmpleado);
	
	Empleados save(Empleados empleado);
	
	Empleados update(Empleados empleado);
}
