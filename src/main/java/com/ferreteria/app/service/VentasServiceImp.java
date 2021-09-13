package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.Ventas;
import com.ferreteria.app.repository.VentasRepository;

@Service
public class VentasServiceImp implements VentasService {

	@Autowired
	private VentasRepository ventasRepository;
	
	@Override
	public List<Ventas> findAll() {
		
		return ventasRepository.findAll();
	}

	@Override
	public Ventas findById(Integer idVenta) {
		
		Optional<Ventas> ventasO = ventasRepository.findById(idVenta);
		return ventasO.isPresent() ? ventasO.get() : new Ventas();
	}

	@Override
	public Ventas save(Ventas ventas) {
		
		return ventasRepository.save(ventas);
	}

	@Override
	public Ventas update(Ventas ventas) {
		
		return ventasRepository.save(ventas);
	}
}
