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

import com.ferreteria.app.entity.TipoCliente;
import com.ferreteria.app.service.TipoClienteService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/TipoCliente")
public class TipoClienteController {

	@Autowired
	private TipoClienteService tipoClienteService;
	
	
	@ApiOperation(value = "Obtener todos los TipoCliente",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "TipoCliente")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron TipoCliente en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	@GetMapping
	public List<TipoCliente> findAll(){
		return tipoClienteService.findAll();
	}
	
	@GetMapping("/{idTipoCliente}")
	public TipoCliente findById(@PathVariable("idTipoCliente") Integer idTipoCliente) throws Exception{
		return tipoClienteService.findById(idTipoCliente);
	}

	@PostMapping
	public @ResponseBody TipoCliente save(@RequestBody TipoCliente tipoCliente) {
		return tipoClienteService.save(tipoCliente);
		
	}
	
	@PutMapping
	public @ResponseBody TipoCliente update(@RequestBody TipoCliente tipoCliente) {
		return tipoClienteService.update(tipoCliente);
		
	}
	
	@DeleteMapping("/{idTipoCliente}")
    public String deleteById(@PathVariable("idTipoCliente") Integer idTipoCliente) throws Exception {
		tipoClienteService.deleteById(idTipoCliente);
        return "Item eliminado correctamente";
    }
}
