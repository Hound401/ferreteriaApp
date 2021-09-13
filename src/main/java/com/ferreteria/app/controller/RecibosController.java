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

import com.ferreteria.app.entity.Recibos;
import com.ferreteria.app.service.RecibosService;

@RestController
@RequestMapping("/Recibos")
public class RecibosController {

	@Autowired
	private RecibosService recibosService;
	
	@GetMapping
	public List<Recibos> findAll(){
		return recibosService.findAll();
	}
	
	@GetMapping("/{idRecibo}")
	public Recibos findById(@PathVariable("idRecibo") Integer idRecibo){
		return recibosService.findById(idRecibo);
	}

	@PostMapping
	public @ResponseBody Recibos save(@RequestBody Recibos recibos) {
		return recibosService.save(recibos);
		
	}
	
	@PutMapping
	public @ResponseBody Recibos update(@RequestBody Recibos recibos) {
		return recibosService.update(recibos);
		
	}
}
