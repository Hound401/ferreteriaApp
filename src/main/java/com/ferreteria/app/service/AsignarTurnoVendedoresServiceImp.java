package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.AsignarTurnoVendedores;
import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.repository.AsignarTurnoVendedoresRepository;

@Service
public class AsignarTurnoVendedoresServiceImp implements AsignarTurnoVendedoresService{

	@Autowired
	private AsignarTurnoVendedoresRepository asignarTurnoVendedoresRepository;
	
	@Override
	public List<AsignarTurnoVendedores> findAll() {
		
		return asignarTurnoVendedoresRepository.findAll();
	}

	@Override
	public AsignarTurnoVendedores findById(Integer idAsignarTurnoVendedores) {
		
		Optional<AsignarTurnoVendedores> asignarTurnoVendedoresO = asignarTurnoVendedoresRepository.findById(idAsignarTurnoVendedores);
		return asignarTurnoVendedoresO.isPresent() ? asignarTurnoVendedoresO.get() : new AsignarTurnoVendedores();
	}

	@Override
	public AsignarTurnoVendedores save(AsignarTurnoVendedores asignarTurnoVendedores) {
		
		return asignarTurnoVendedoresRepository.save(asignarTurnoVendedores);
	}

	@Override
	public AsignarTurnoVendedores update(AsignarTurnoVendedores asignarTurnoVendedores) {
		
		return asignarTurnoVendedoresRepository.save(asignarTurnoVendedores);
	}
	
	@Override
	public boolean deleteById(Integer idAsignarTurnoVendedores) throws Exception {
        Optional<AsignarTurnoVendedores> optionalATV = asignarTurnoVendedoresRepository.findById(idAsignarTurnoVendedores);
        if(!optionalATV.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idAsignarTurnoVendedores);
        }
        asignarTurnoVendedoresRepository.deleteById(idAsignarTurnoVendedores);
        return true;
    }	
}
