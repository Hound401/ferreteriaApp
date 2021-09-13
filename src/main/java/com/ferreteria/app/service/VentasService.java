package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Ventas;

public interface VentasService {

	List<Ventas> findAll();
	
	Ventas findById(Integer idVenta);
	
	Ventas save(Ventas ventas);
	
	Ventas update(Ventas ventas);
}
