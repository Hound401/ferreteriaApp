package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.DetalleVenta;
import com.ferreteria.app.repository.DetalleVentaRepository;

@Service
public class DetalleVentaServiceImp implements DetalleVentaService {

	@Autowired
	private DetalleVentaRepository detalleVentaRepository;
	
	@Override
	public List<DetalleVenta> findAll() {
		
		return detalleVentaRepository.findAll();
	}

	@Override
	public DetalleVenta findById(Integer idDetalleVenta) {
		
		Optional<DetalleVenta> detalleVentaO = detalleVentaRepository.findById(idDetalleVenta);
		return detalleVentaO.isPresent() ? detalleVentaO.get() : new DetalleVenta();
	}

	@Override
	public DetalleVenta save(DetalleVenta detalleVenta) {
		
		return detalleVentaRepository.save(detalleVenta);
	}

	@Override
	public DetalleVenta update(DetalleVenta detalleVenta) {
		
		return detalleVentaRepository.save(detalleVenta);
	}
	
	@Override
	public boolean deleteById(Integer idDetalleVenta) throws Exception {
        Optional<DetalleVenta> optionalDV = detalleVentaRepository.findById(idDetalleVenta);
        if(!optionalDV.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idDetalleVenta);
        }
        detalleVentaRepository.deleteById(idDetalleVenta);
        return true;
    }
}
