package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Factura;

public interface FacturaService {

	
List<Factura> findAll();
	
	Factura findById(Integer ifFactura);
	
	Factura save(Factura factura);
	
	Factura update(Factura factura);
}
