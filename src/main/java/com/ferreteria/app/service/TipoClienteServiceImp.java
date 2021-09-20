package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.TipoCliente;
import com.ferreteria.app.repository.TipoClienteRepository;

@Service
public class TipoClienteServiceImp implements TipoClienteService {
	
	@Autowired
	private TipoClienteRepository tipoClienteRepository;
	
	@Override
	public List<TipoCliente> findAll() {
		
		return tipoClienteRepository.findAll();
	}

	@Override
	public TipoCliente findById(Integer idTipoCliente) {
		
		Optional<TipoCliente> tipoClienteO = tipoClienteRepository.findById(idTipoCliente);
		return tipoClienteO.isPresent() ? tipoClienteO.get() : new TipoCliente();
	}

	@Override
	public TipoCliente save(TipoCliente tipoCliente) {
		
		return tipoClienteRepository.save(tipoCliente);
	}

	@Override
	public TipoCliente update(TipoCliente tipoCliente) {
		
		return tipoClienteRepository.save(tipoCliente);
	}
	
	@Override
	public boolean deleteById(Integer idTipoCliente) throws Exception {
        Optional<TipoCliente> optionalTCliente = tipoClienteRepository.findById(idTipoCliente);
        if(!optionalTCliente.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idTipoCliente);
        }
        tipoClienteRepository.deleteById(idTipoCliente);
        return true;
    }	

}
