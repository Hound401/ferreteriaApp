package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.AsignarTurnoVendedores;

public interface AsignarTurnoVendedoresService {

	List<AsignarTurnoVendedores> findAll();
	
	AsignarTurnoVendedores findById(Integer idAsignarTurnoVendedores);
	
	AsignarTurnoVendedores save(AsignarTurnoVendedores asignarTurnoVendedores);
	
	AsignarTurnoVendedores update(AsignarTurnoVendedores asignarTurnoVendedores);
}
