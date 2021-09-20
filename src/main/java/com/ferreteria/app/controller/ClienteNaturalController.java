package com.ferreteria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.app.entity.ClienteNatural;
import com.ferreteria.app.service.ClienteNaturalService;

@RestController
@RequestMapping("/ClienteNatural")
public class ClienteNaturalController {

	@Autowired
	private ClienteNaturalService clienteNaturalService;
	
	@GetMapping
	public List<ClienteNatural> findAll(){
		return clienteNaturalService.findAll();
	}
	
	@GetMapping("/{idClienteNatural}")
	public ClienteNatural findById(@PathVariable("idClienteNatural") Integer idClienteNatural) throws Exception{
		return clienteNaturalService.findById(idClienteNatural);
	}

	@PostMapping
	public @ResponseBody ClienteNatural save(@RequestBody ClienteNatural clienteNatural) {
		return clienteNaturalService.save(clienteNatural);
		
	}
	
	@PutMapping
	public @ResponseBody ClienteNatural update(@RequestBody ClienteNatural clienteNatural) {
		return clienteNaturalService.update(clienteNatural);
		
	}
	
	@DeleteMapping("/{idClienteNatural}")
    public String deleteById(@PathVariable("idClienteNatural") Integer idClienteNatural) throws Exception {
		clienteNaturalService.deleteById(idClienteNatural);
        return "Item eliminado correctamente";
    }
}
