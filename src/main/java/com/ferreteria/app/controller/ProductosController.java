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

import com.ferreteria.app.entity.Productos;
import com.ferreteria.app.service.ProductosService;

@RestController
@RequestMapping("/Productos")
public class ProductosController {

	@Autowired
	private ProductosService productosService;
	
	@GetMapping
	public List<Productos> findAll(){
		return productosService.findAll();
	}
	
	@GetMapping("/{idEmpleado}")
	public Productos findById(@PathVariable("idProducto") Integer idProducto) throws Exception{
		return productosService.findById(idProducto);
	}

	@PostMapping
	public @ResponseBody Productos save(@RequestBody Productos productos) {
		return productosService.save(productos);
		
	}
	
	@PutMapping
	public @ResponseBody Productos update(@RequestBody Productos productos) {
		return productosService.update(productos);
		
	}
	
	@DeleteMapping("/{idProducto}")
    public String deleteById(@PathVariable("idProducto") Integer idProducto) throws Exception {
		productosService.deleteById(idProducto);
        return "Item eliminado correctamente";
    }
}
