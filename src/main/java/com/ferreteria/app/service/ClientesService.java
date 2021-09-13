package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Clientes;

public interface ClientesService {

	List<Clientes> findAll();
	
	Clientes findById(Integer idCliente);
	
	Clientes save(Clientes clientes);
	
	Clientes update(Clientes clientes);
}

