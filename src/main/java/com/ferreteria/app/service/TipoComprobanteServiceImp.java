package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.TipoComprobante;
import com.ferreteria.app.repository.TipoComprobanteRepository;

@Service
public class TipoComprobanteServiceImp implements TipoComprobanteService {

	@Autowired
	private TipoComprobanteRepository tipoComprobanteRepository;
	
	@Override
	public List<TipoComprobante> findAll() {
		
		return tipoComprobanteRepository.findAll();
	}

	@Override
	public TipoComprobante findById(Integer idTipoComprobante) {
		
		Optional<TipoComprobante> tipoComprobanteO = tipoComprobanteRepository.findById(idTipoComprobante);
		return tipoComprobanteO.isPresent() ? tipoComprobanteO.get() : new TipoComprobante();
	}

	@Override
	public TipoComprobante save(TipoComprobante tipoComprobante) {
		
		return tipoComprobanteRepository.save(tipoComprobante);
	}

	@Override
	public TipoComprobante update(TipoComprobante tipoComprobante) {
		
		return tipoComprobanteRepository.save(tipoComprobante);
	}
}
