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

import com.ferreteria.app.entity.DetalleVenta;
import com.ferreteria.app.service.DetalleVentaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/DetalleVenta")
public class DetalleVentaController {

	@Autowired
	private DetalleVentaService detalleVentaService;
	
	
	@ApiOperation(value = "Obtener todos los DetalleVenta",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "DetalleVenta")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron DetalleVenta en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	@GetMapping
	public List<DetalleVenta> findAll(){
		return detalleVentaService.findAll();
	}
	
	@GetMapping("/{idDetalleVenta}")
	public DetalleVenta findById(@PathVariable("idDetalleVenta") Integer idDetalleVenta) throws Exception{
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
	
	@DeleteMapping("/{idDetalleVenta}")
    public String deleteById(@PathVariable("idDetalleVenta") Integer idDetalleVenta) throws Exception {
		detalleVentaService.deleteById(idDetalleVenta);
        return "Item eliminado correctamente";
    }
}
