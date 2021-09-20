package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.TipoProducto;
import com.ferreteria.app.repository.TipoProductoRepository;

@Service
public class TipoProductoServiceImp implements TipoProductoService {

	@Autowired
	private TipoProductoRepository tipoProductoRepository;
	
	@Override
	public List<TipoProducto> findAll() {
		
		return tipoProductoRepository.findAll();
	}

	@Override
	public TipoProducto findById(Integer idTipoProducto) {
		
		Optional<TipoProducto> tipoProductoO = tipoProductoRepository.findById(idTipoProducto);
		return tipoProductoO.isPresent() ? tipoProductoO.get() : new TipoProducto();
	}

	@Override
	public TipoProducto save(TipoProducto tipoProducto) {
		
		return tipoProductoRepository.save(tipoProducto);
	}

	@Override
	public TipoProducto update(TipoProducto tipoProducto) {
		
		return tipoProductoRepository.save(tipoProducto);
	}
	
	@Override
	public boolean deleteById(Integer idTipoProducto) throws Exception {
        Optional<TipoProducto> optionalTP = tipoProductoRepository.findById(idTipoProducto);
        if(!optionalTP.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idTipoProducto);
        }
        tipoProductoRepository.deleteById(idTipoProducto);
        return true;
    }	
}
