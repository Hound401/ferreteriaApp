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

import com.ferreteria.app.entity.TipoProducto;
import com.ferreteria.app.service.TipoProductoService;

@RestController
@RequestMapping("/TipoProducto")
public class TipoProductoController {

	@Autowired
	private TipoProductoService tipoProductoService;
	
	@GetMapping
	public List<TipoProducto> findAll(){
		return tipoProductoService.findAll();
	}
	
	@GetMapping("/{idTipoProducto}")
	public TipoProducto findById(@PathVariable("idTipoProducto") Integer idTipoProducto){
		return tipoProductoService.findById(idTipoProducto);
	}

	@PostMapping
	public @ResponseBody TipoProducto save(@RequestBody TipoProducto tipoProducto) {
		return tipoProductoService.save(tipoProducto);
		
	}
	
	@PutMapping
	public @ResponseBody TipoProducto update(@RequestBody TipoProducto tipoProducto) {
		return tipoProductoService.update(tipoProducto);
		
	}
}
