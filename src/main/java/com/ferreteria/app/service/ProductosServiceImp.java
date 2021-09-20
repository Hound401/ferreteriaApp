package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.Productos;
import com.ferreteria.app.repository.ProductosRepository;

@Service
public class ProductosServiceImp implements ProductosService {

	@Autowired
	private ProductosRepository productosRepository;
	
	@Override
	public List<Productos> findAll() {
		
		return productosRepository.findAll();
	}

	@Override
	public Productos findById(Integer idProducto) {
		
		Optional<Productos> productosO = productosRepository.findById(idProducto);
		return productosO.isPresent() ? productosO.get() : new Productos();
	}

	@Override
	public Productos save(Productos productos) {
		
		return productosRepository.save(productos);
	}

	@Override
	public Productos update(Productos productos) {
		
		return productosRepository.save(productos);
	}
	
	@Override
	public boolean deleteById(Integer idProducto) throws Exception {
        Optional<Productos> optionalProducto = productosRepository.findById(idProducto);
        if(!optionalProducto.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idProducto);
        }
        productosRepository.deleteById(idProducto);
        return true;
    }
}
