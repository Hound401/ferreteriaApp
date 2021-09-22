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

import com.ferreteria.app.entity.Clientes;
import com.ferreteria.app.service.ClientesService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/Clientes")
public class ClientesController {

	@Autowired
	private ClientesService clientesService;
	
	@ApiOperation(value = "Obtener todos los Clientes",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "Clientes")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron clientes en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public List<Clientes> findAll(){
		return clientesService.findAll();
	}
	
	
	@GetMapping("/{idCliente}")
	public Clientes findById(@PathVariable("idCliente") Integer idCliente) throws Exception{
		return clientesService.findById(idCliente);
	}

	@PostMapping
	public @ResponseBody Clientes save(@RequestBody Clientes clientes) {
		return clientesService.save(clientes);
		
	}
	
	@PutMapping
	public @ResponseBody Clientes update(@RequestBody Clientes clientes) {
		return clientesService.update(clientes);
		
	}
	
	@DeleteMapping("/{idCliente}")
    public String deleteById(@PathVariable("idCliente") Integer idCliente) throws Exception {
		clientesService.deleteById(idCliente);
        return "Item eliminado correctamente";
    }
}
