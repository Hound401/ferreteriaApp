package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.Factura;
import com.ferreteria.app.repository.FacturaRepository;

@Service
public class FacturaServiceImp implements FacturaService {
	
	@Autowired
	private FacturaRepository facturaRepository;
	
	@Override
	public List<Factura> findAll() {
		
		return facturaRepository.findAll();
	}

	@Override
	public Factura findById(Integer ifFactura) {
		
		Optional<Factura> facturaO = facturaRepository.findById(ifFactura);
		return facturaO.isPresent() ? facturaO.get() : new Factura();
	}

	@Override
	public Factura save(Factura factura) {
		
		return facturaRepository.save(factura);
	}

	@Override
	public Factura update(Factura factura) {
		
		return facturaRepository.save(factura);
	}

}
