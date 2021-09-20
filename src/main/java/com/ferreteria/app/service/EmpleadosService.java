package com.ferreteria.app.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ferreteria.app.entity.Empleados;

public interface EmpleadosService extends ICRUD<Empleados>{

	Page<Empleados> listarPageable(Pageable pageable);

	
}
