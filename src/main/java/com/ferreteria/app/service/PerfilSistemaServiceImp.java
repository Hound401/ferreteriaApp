package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.PerfilSistema;
import com.ferreteria.app.repository.PerfilSistemaRepository;

@Service
public class PerfilSistemaServiceImp implements PerfilSistemaService {
	
	@Autowired
	private PerfilSistemaRepository perfilSistemaRepository;
	
	@Override
	public List<PerfilSistema> findAll() {
		
		return perfilSistemaRepository.findAll();
	}

	@Override
	public PerfilSistema findById(Integer idPerfilSistema) {
		
		Optional<PerfilSistema> perfilSistemaO = perfilSistemaRepository.findById(idPerfilSistema);
		return perfilSistemaO.isPresent() ? perfilSistemaO.get() : new PerfilSistema();
	}

	@Override
	public PerfilSistema save(PerfilSistema perfilSistema) {
		
		return perfilSistemaRepository.save(perfilSistema);
	}

	@Override
	public PerfilSistema update(PerfilSistema perfilSistema) {
		
		return perfilSistemaRepository.save(perfilSistema);
	}

}
