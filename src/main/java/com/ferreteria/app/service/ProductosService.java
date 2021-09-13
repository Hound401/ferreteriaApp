package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Productos;

public interface ProductosService {

	List<Productos> findAll();
	
	Productos findById(Integer idProducto);
	
	Productos save(Productos productos);
	
	Productos update(Productos productos);
}
