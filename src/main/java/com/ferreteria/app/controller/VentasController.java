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

import com.ferreteria.app.entity.Ventas;
import com.ferreteria.app.service.VentasService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Ventas")
public class VentasController {

	@Autowired
	private VentasService ventasService;
	
	@ApiOperation(value = "Obtener todas las Ventas",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Ventas")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Ventas en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public List<Ventas> findAll(){
		return ventasService.findAll();
	}
	
	@GetMapping("/{idVenta}")
	public Ventas findById(@PathVariable("idVenta") Integer idVenta) throws Exception{
		return ventasService.findById(idVenta);
	}

	@PostMapping
	public @ResponseBody Ventas save(@RequestBody Ventas ventas) {
		return ventasService.save(ventas);
		
	}
	
	@PutMapping
	public @ResponseBody Ventas update(@RequestBody Ventas ventas) {
		return ventasService.update(ventas);
		
	}
	
	@DeleteMapping("/{idVenta}")
    public String deleteById(@PathVariable("idVenta") Integer idVenta) throws Exception {
		ventasService.deleteById(idVenta);
        return "Item eliminado correctamente";
    }
}
