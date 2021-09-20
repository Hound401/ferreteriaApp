package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.entity.Turnos;
import com.ferreteria.app.repository.TurnosRepository;

@Service 
public class TurnosServiceImp implements TurnosService {

	@Autowired
	private TurnosRepository turnosRepository;
	
	@Override
	public List<Turnos> findAll() {
		
		return turnosRepository.findAll();
	}

	@Override
	public Turnos findById(Integer idTurno) {
		
		Optional<Turnos> turnoO = turnosRepository.findById(idTurno);
		return turnoO.isPresent() ? turnoO.get() : new Turnos();
	}

	@Override
	public Turnos save(Turnos turnos) {
		
		return turnosRepository.save(turnos);
	}

	@Override
	public Turnos update(Turnos turnos) {
		
		return turnosRepository.save(turnos);
	}
	
	@Override
	public boolean deleteById(Integer idTurno) throws Exception {
        Optional<Turnos> optionalTurno = turnosRepository.findById(idTurno);
        if(!optionalTurno.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idTurno);
        }
        turnosRepository.deleteById(idTurno);
        return true;
    }	
}
