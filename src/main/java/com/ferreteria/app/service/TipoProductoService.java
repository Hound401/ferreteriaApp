package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.TipoProducto;

public interface TipoProductoService {

	List<TipoProducto> findAll();
	
	TipoProducto findById(Integer idTipoProducto);
	
	TipoProducto save(TipoProducto tipoProducto);
	
	TipoProducto update(TipoProducto tipoProducto);	
}
