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

import com.ferreteria.app.entity.DetalleVenta;
import com.ferreteria.app.service.DetalleVentaService;


@RestController
@RequestMapping("/DetalleVenta")
public class DetalleVentaController {

	@Autowired
	private DetalleVentaService detalleVentaService;
	
	@GetMapping
	public List<DetalleVenta> findAll(){
		return detalleVentaService.findAll();
	}
	
	@GetMapping("/{idDetalleVenta}")
	public DetalleVenta findById(@PathVariable("idDetalleVenta") Integer idDetalleVenta){
		return detalleVentaService.findById(idDetalleVenta);
	}

	@PostMapping
	public @ResponseBody DetalleVenta save(@RequestBody DetalleVenta detalleVenta) {
		return detalleVentaService.save(detalleVenta);
		
	}
	
	@PutMapping
	public @ResponseBody DetalleVenta update(@RequestBody DetalleVenta detalleVenta) {
		return detalleVentaService.update(detalleVenta);
		
	}
}
