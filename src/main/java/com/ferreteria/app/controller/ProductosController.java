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

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Productos")
public class ProductosController {

	@Autowired
	private ProductosService productosService;
	
	@ApiOperation(value = "Obtener todos los Productos",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Productos")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Productos en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
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
