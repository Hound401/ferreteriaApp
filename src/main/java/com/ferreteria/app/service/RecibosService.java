package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Recibos;

public interface RecibosService {
	
	List<Recibos> findAll();
	
	Recibos findById(Integer idRecibo);
	
	Recibos save(Recibos recibos);
	
	Recibos update(Recibos recibos);
}
