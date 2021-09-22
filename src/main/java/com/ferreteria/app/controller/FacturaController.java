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

import com.ferreteria.app.entity.Factura;
import com.ferreteria.app.service.FacturaService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Factura")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;
	
	
	@ApiOperation(value = "Obtener todos las Factura",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Factura")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Factura en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	@GetMapping
	public List<Factura> findAll(){
		return facturaService.findAll();
	}
	
	@GetMapping("/{idFactura}")
	public Factura findById(@PathVariable("idFactura") Integer idFactura) throws Exception{
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
	
	@DeleteMapping("/{idFactura}")
    public String deleteById(@PathVariable("idFactura") Integer idFactura) throws Exception {
		facturaService.deleteById(idFactura);
        return "Item eliminado correctamente";
    }
}
