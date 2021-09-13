package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteNatural;
import com.ferreteria.app.repository.ClienteNaturalRepository;

@Service
public class ClienteNaturalServiceImp implements ClienteNaturalService {

	@Autowired
	private ClienteNaturalRepository clienteNaturalRepository;
	
	@Override
	public List<ClienteNatural> findAll() {
		
		return clienteNaturalRepository.findAll();
	}

	@Override
	public ClienteNatural findById(Integer idClienteNatural) {
		
		Optional<ClienteNatural> clienteNaturalO = clienteNaturalRepository.findById(idClienteNatural);
		return clienteNaturalO.isPresent() ? clienteNaturalO.get() : new ClienteNatural();
	}

	@Override
	public ClienteNatural save(ClienteNatural clienteNatural) {
		
		return clienteNaturalRepository.save(clienteNatural);
	}

	@Override
	public ClienteNatural update(ClienteNatural clienteNatural) {
		
		return clienteNaturalRepository.save(clienteNatural);
	}
}
