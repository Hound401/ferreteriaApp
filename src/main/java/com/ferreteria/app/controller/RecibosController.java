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

import com.ferreteria.app.entity.Recibos;
import com.ferreteria.app.service.RecibosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Recibos")
public class RecibosController {

	@Autowired
	private RecibosService recibosService;
	
	@ApiOperation(value = "Obtener todos los Recibos",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Recibos")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Recibos en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public List<Recibos> findAll(){
		return recibosService.findAll();
	}
	
	@GetMapping("/{idRecibo}")
	public Recibos findById(@PathVariable("idRecibo") Integer idRecibo) throws Exception{
		return recibosService.findById(idRecibo);
	}

	@PostMapping
	public @ResponseBody Recibos save(@RequestBody Recibos recibos) {
		return recibosService.save(recibos);
		
	}
	
	@PutMapping
	public @ResponseBody Recibos update(@RequestBody Recibos recibos) {
		return recibosService.update(recibos);
		
	}
	
	@DeleteMapping("/{idRecibo}")
    public String deleteById(@PathVariable("idRecibo") Integer idRecibo) throws Exception {
		recibosService.deleteById(idRecibo);
        return "Item eliminado correctamente";
    }
}
