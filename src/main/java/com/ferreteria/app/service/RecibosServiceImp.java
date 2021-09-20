package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.Recibos;
import com.ferreteria.app.repository.RecibosRepository;

@Service
public class RecibosServiceImp implements RecibosService{

	@Autowired
	private RecibosRepository recibosRepository;
	
	@Override
	public List<Recibos> findAll() {
		
		return recibosRepository.findAll();
	}

	@Override
	public Recibos findById(Integer idRecibo) {
		
		Optional<Recibos> recibosO = recibosRepository.findById(idRecibo);
		return recibosO.isPresent() ? recibosO.get() : new Recibos();
	}

	@Override
	public Recibos save(Recibos recibos) {
		
		return recibosRepository.save(recibos);
	}

	@Override
	public Recibos update(Recibos recibos) {
		
		return recibosRepository.save(recibos);
	}
	
	@Override
	public boolean deleteById(Integer idRecibo) throws Exception {
        Optional<Recibos> optionalCJ = recibosRepository.findById(idRecibo);
        if(!optionalCJ.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idRecibo);
        }
        recibosRepository.deleteById(idRecibo);
        return true;
    }
}
