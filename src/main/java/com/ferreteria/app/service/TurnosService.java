package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.Turnos;

public interface TurnosService {

	List<Turnos> findAll();
	
	Turnos findById(Integer idTurno);
	
	Turnos save(Turnos turnos);
	
	Turnos update(Turnos turnos);
}
