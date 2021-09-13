package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.ClienteNatural;

public interface ClienteNaturalService {

	List<ClienteNatural> findAll();
	
	ClienteNatural findById(Integer idClienteNatural);
	
	ClienteNatural save(ClienteNatural clienteNatural);
	
	ClienteNatural update(ClienteNatural clienteNatural);
}
