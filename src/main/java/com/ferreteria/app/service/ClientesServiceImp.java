package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.Clientes;
import com.ferreteria.app.entity.Empleados;
import com.ferreteria.app.exception.ModeloNotFoundException;
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
	public Clientes findById(Integer idCliente) throws Exception {	
		Optional<Clientes> optionalCliente = clientesRepository.findById(idCliente);
        if(!optionalCliente.isPresent()){
            throw new ModeloNotFoundException("ID NO ENCONTRADO: " + idCliente);
        }
        return optionalCliente.get();
	}

	@Override
	public Clientes save(Clientes clientes) {
		
		return clientesRepository.save(clientes);
	}

	@Override
	public Clientes update(Clientes clientes) {
		
		return clientesRepository.save(clientes);
	}
	
	@Override
	public boolean deleteById(Integer idCliente) throws Exception {
        Optional<Clientes> optionalCliente = clientesRepository.findById(idCliente);
        if(!optionalCliente.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idCliente);
        }
        clientesRepository.deleteById(idCliente);
        return true;
    }
}
