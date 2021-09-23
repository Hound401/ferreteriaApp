package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.Ventas;
import com.ferreteria.app.repository.ClientesRepository;
import com.ferreteria.app.repository.EmpleadosRepository;
import com.ferreteria.app.repository.VentasRepository;

@Service
public class VentasServiceImp implements VentasService {

	@Autowired
	private VentasRepository ventasRepository;
	
	@Autowired
	private EmpleadosRepository empleadosRepository;
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	@Override
	public List<Ventas> findAll() {
		
		return ventasRepository.findAll();
	}

	@Override
	public Ventas findById(Integer idVenta) throws Exception {
		
		Optional<Ventas> optionalVenta = ventasRepository.findById(idVenta);
		if(!optionalVenta.isPresent()) {
			throw new Exception("ID NO ENCONTRADO " + idVenta);
		}
		return optionalVenta.get();
	}

	@Override
	public Ventas save(Ventas ventas) {
		
		return ventasRepository.save(ventas);
	}

	@Override
	public Ventas update(Ventas ventas) {
		
		return ventasRepository.save(ventas);
	}
	
	@Override
	public boolean deleteById(Integer idVenta) throws Exception {
        Optional<Ventas> optionalVenta = ventasRepository.findById(idVenta);
        if(!optionalVenta.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idVenta);
        }
        ventasRepository.deleteById(idVenta);
        return true;
    }
}
