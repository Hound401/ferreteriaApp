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

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.service.ClienteJuridicoService;




@RestController
@RequestMapping("/ClienteJuridico")
public class ClienteJuridicoController {

	@Autowired
	private ClienteJuridicoService clienteJuridicoService;
	
	@GetMapping
	public List<ClienteJuridico> findAll(){
		return clienteJuridicoService.findAll();
	}
	
	@GetMapping("/{idClienteJuridico}")
	public ClienteJuridico findById(@PathVariable("idClienteJuridico") Integer idClienteJuridico){
		return clienteJuridicoService.findById(idClienteJuridico);
	}

	@PostMapping
	public @ResponseBody ClienteJuridico save(@RequestBody ClienteJuridico clienteJuridico) {
		return clienteJuridicoService.save(clienteJuridico);
		
	}
	
	@PutMapping
	public @ResponseBody ClienteJuridico update(@RequestBody ClienteJuridico clienteJuridico) {
		return clienteJuridicoService.update(clienteJuridico);
		
	}
}
