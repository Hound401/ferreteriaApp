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

import com.ferreteria.app.entity.Clientes;
import com.ferreteria.app.service.ClientesService;


@RestController
@RequestMapping("/Clientes")
public class ClientesController {

	@Autowired
	private ClientesService clientesService;
	
	@GetMapping
	public List<Clientes> findAll(){
		return clientesService.findAll();
	}
	
	@GetMapping("/{idCliente}")
	public Clientes findById(@PathVariable("idCliente") Integer idCliente){
		return clientesService.findById(idCliente);
	}

	@PostMapping
	public @ResponseBody Clientes save(@RequestBody Clientes clientes) {
		return clientesService.save(clientes);
		
	}
	
	@PutMapping
	public @ResponseBody Clientes update(@RequestBody Clientes clientes) {
		return clientesService.update(clientes);
		
	}
}
