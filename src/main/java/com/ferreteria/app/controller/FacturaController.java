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

import com.ferreteria.app.entity.Factura;
import com.ferreteria.app.service.FacturaService;

@RestController
@RequestMapping("/Factura")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;
	
	@GetMapping
	public List<Factura> findAll(){
		return facturaService.findAll();
	}
	
	@GetMapping("/{idFactura}")
	public Factura findById(@PathVariable("idFactura") Integer idFactura){
		return facturaService.findById(idFactura);
	}

	@PostMapping
	public @ResponseBody Factura save(@RequestBody Factura factura) {
		return facturaService.save(factura);
		
	}
	
	@PutMapping
	public @ResponseBody Factura update(@RequestBody Factura factura) {
		return facturaService.update(factura);
		
	}
}
