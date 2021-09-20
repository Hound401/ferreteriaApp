package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.Empleados;
import com.ferreteria.app.repository.ClienteJuridicoRepository;

@Service
public class ClienteJuridicoServiceImp implements ClienteJuridicoService {
	
	@Autowired
	private ClienteJuridicoRepository clienteJuridicoRepository;
	
	@Override
	public List<ClienteJuridico> findAll() {
		
		return clienteJuridicoRepository.findAll();
	}

	@Override
	public ClienteJuridico findById(Integer idClienteJuridico) {
		
		Optional<ClienteJuridico> clienteJuridicoO = clienteJuridicoRepository.findById(idClienteJuridico);
		return clienteJuridicoO.isPresent() ? clienteJuridicoO.get() : new ClienteJuridico();
	}

	@Override
	public ClienteJuridico save(ClienteJuridico clienteJuridico) {
		
		return clienteJuridicoRepository.save(clienteJuridico);
	}

	@Override
	public ClienteJuridico update(ClienteJuridico clienteJuridico) {
		
		return clienteJuridicoRepository.save(clienteJuridico);
	}
	
	@Override
	public boolean deleteById(Integer idClienteJuridico) throws Exception {
        Optional<ClienteJuridico> optionalCJ = clienteJuridicoRepository.findById(idClienteJuridico);
        if(!optionalCJ.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idClienteJuridico);
        }
        clienteJuridicoRepository.deleteById(idClienteJuridico);
        return true;
    }	
}
