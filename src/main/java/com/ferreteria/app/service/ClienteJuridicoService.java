package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.ClienteJuridico;

public interface ClienteJuridicoService {

	List<ClienteJuridico> findAll();
	
	ClienteJuridico findById(Integer idClienteJuridico);
	
	ClienteJuridico save(ClienteJuridico clienteJuridico);
	
	ClienteJuridico update(ClienteJuridico clienteJuridico);
}
