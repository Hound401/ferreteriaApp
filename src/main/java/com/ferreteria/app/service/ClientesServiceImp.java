package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.Clientes;
import com.ferreteria.app.repository.ClientesRepository;

@Service
public class ClientesServiceImp implements ClientesService {

	@Autowired
	private ClientesRepository clientesRepository;
	
	@Override
	public List<Clientes> findAll() {
		
		return clientesRepository.findAll();
	}

	@Override
	public Clientes findById(Integer idCliente) {
		
		Optional<Clientes> clientesO = clientesRepository.findById(idCliente);
		return clientesO.isPresent() ? clientesO.get() : new Clientes();
	}

	@Override
	public Clientes save(Clientes clientes) {
		
		return clientesRepository.save(clientes);
	}

	@Override
	public Clientes update(Clientes clientes) {
		
		return clientesRepository.save(clientes);
	}
}
