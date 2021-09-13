package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.TipoComprobante;

public interface TipoComprobanteService {

	List<TipoComprobante> findAll();
	
	TipoComprobante findById(Integer idTipoComprobante);
	
	TipoComprobante save(TipoComprobante tipoComprobante);
	
	TipoComprobante update(TipoComprobante tipoComprobante);
}
