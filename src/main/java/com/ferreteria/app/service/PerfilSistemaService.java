package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.PerfilSistema;

public interface PerfilSistemaService {

	List<PerfilSistema> findAll();
	
	PerfilSistema findById(Integer idPerfilSistema);
	
	PerfilSistema save(PerfilSistema perfilSistema);
	
	PerfilSistema update(PerfilSistema perfilSistema);
}
