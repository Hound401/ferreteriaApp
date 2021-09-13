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

import com.ferreteria.app.entity.TipoComprobante;
import com.ferreteria.app.service.TipoComprobanteService;

@RestController
@RequestMapping("/TipoComprobante")
public class TipoComprobanteController {

	@Autowired
	private TipoComprobanteService tipoComprobanteService;
	
	@GetMapping
	public List<TipoComprobante> findAll(){
		return tipoComprobanteService.findAll();
	}
	
	@GetMapping("/{idTipoComprobante}")
	public TipoComprobante findById(@PathVariable("idTipoComprobante") Integer idTipoComprobante){
		return tipoComprobanteService.findById(idTipoComprobante);
	}

	@PostMapping
	public @ResponseBody TipoComprobante save(@RequestBody TipoComprobante tipoComprobante) {
		return tipoComprobanteService.save(tipoComprobante);
		
	}
	
	@PutMapping
	public @ResponseBody TipoComprobante update(@RequestBody TipoComprobante tipoComprobante) {
		return tipoComprobanteService.update(tipoComprobante);
		
	}
}
