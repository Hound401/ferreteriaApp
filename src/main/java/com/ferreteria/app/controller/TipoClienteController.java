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

import com.ferreteria.app.entity.TipoCliente;
import com.ferreteria.app.service.TipoClienteService;

@RestController
@RequestMapping("/TipoCliente")
public class TipoClienteController {

	@Autowired
	private TipoClienteService tipoClienteService;
	
	@GetMapping
	public List<TipoCliente> findAll(){
		return tipoClienteService.findAll();
	}
	
	@GetMapping("/{idTipoCliente}")
	public TipoCliente findById(@PathVariable("idTipoCliente") Integer idTipoCliente){
		return tipoClienteService.findById(idTipoCliente);
	}

	@PostMapping
	public @ResponseBody TipoCliente save(@RequestBody TipoCliente tipoCliente) {
		return tipoClienteService.save(tipoCliente);
		
	}
	
	@PutMapping
	public @ResponseBody TipoCliente update(@RequestBody TipoCliente tipoCliente) {
		return tipoClienteService.update(tipoCliente);
		
	}
}
