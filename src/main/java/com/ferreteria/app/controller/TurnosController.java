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

import com.ferreteria.app.entity.Turnos;
import com.ferreteria.app.service.TurnosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/Turnos")
public class TurnosController {

	@Autowired
	private TurnosService turnosService;
	
	@ApiOperation(value = "Obtener todos los Turnos",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Turnos")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron Turnos en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public List<Turnos> findAll(){
		return turnosService.findAll();
	}
	
	@GetMapping("/{idturno}")
	public Turnos findById(@PathVariable("idturno") Integer idturno) throws Exception{
		return turnosService.findById(idturno);
	}

	@PostMapping
	public @ResponseBody Turnos save(@RequestBody Turnos turnos) {
		return turnosService.save(turnos);
		
	}
	
	@PutMapping
	public @ResponseBody Turnos update(@RequestBody Turnos turnos) {
		return turnosService.update(turnos);
		
	}
	
	@DeleteMapping("/{idturno}")
    public String deleteById(@PathVariable("idturno") Integer idturno) throws Exception {
		turnosService.deleteById(idturno);
        return "Item eliminado correctamente";
    }
}
