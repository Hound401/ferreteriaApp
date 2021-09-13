package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.TipoCliente;

public interface TipoClienteService {

	List<TipoCliente> findAll();
	
	TipoCliente findById(Integer idTipoCliente);
	
	TipoCliente save(TipoCliente tipoCliente);
	
	TipoCliente update(TipoCliente tipoCliente);
}
