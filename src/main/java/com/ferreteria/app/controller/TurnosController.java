package com.ferreteria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.app.entity.Turnos;
import com.ferreteria.app.service.TurnosService;

@RestController
@RequestMapping("/Turnos")
public class TurnosController {

	@Autowired
	private TurnosService turnosService;
	
	@GetMapping
	public List<Turnos> findAll(){
		return turnosService.findAll();
	}
	
	@GetMapping("/{idturno}")
	public Turnos findById(@PathVariable("idturno") Integer idturno){
		return turnosService.findById(idturno);
	}

	@PostMapping
	public @ResponseBody Turnos save(@RequestBody Turnos turnos) {
		return turnosService.save(turnos);
		
	}
	
	@PutMapping
	public @ResponseBody Turnos update(@RequestBody Turnos turnos) {
		return turnosService.update(turnos);
		
	}
}
