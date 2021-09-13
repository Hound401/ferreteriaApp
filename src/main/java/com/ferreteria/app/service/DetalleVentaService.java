package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.DetalleVenta;

public interface DetalleVentaService {

	List<DetalleVenta> findAll();
	
	DetalleVenta findById(Integer idDetalleVenta);
	
	DetalleVenta save(DetalleVenta detalleVenta);
	
	DetalleVenta update(DetalleVenta detalleVenta);
}
