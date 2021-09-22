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

import com.ferreteria.app.entity.ClienteJuridico;
import com.ferreteria.app.service.ClienteJuridicoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/ClienteJuridico")
public class ClienteJuridicoController {

	@Autowired
	private ClienteJuridicoService clienteJuridicoService;
	
	@ApiOperation(value = "Obtener todos los Clientes Juridicos",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "ClienteJuridico")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron ClienteJuridico en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	@GetMapping
	public List<ClienteJuridico> findAll(){
		return clienteJuridicoService.findAll();
	}
	
	@GetMapping("/{idClienteJuridico}")
	public ClienteJuridico findById(@PathVariable("idClienteJuridico") Integer idClienteJuridico) throws Exception{
		return clienteJuridicoService.findById(idClienteJuridico);
	}

	@PostMapping
	public @ResponseBody ClienteJuridico save(@RequestBody ClienteJuridico clienteJuridico) {
		return clienteJuridicoService.save(clienteJuridico);
		
	}
	
	@PutMapping
	public @ResponseBody ClienteJuridico update(@RequestBody ClienteJuridico clienteJuridico) {
		return clienteJuridicoService.update(clienteJuridico);
		
	}
	
	@DeleteMapping("/{idClienteJuridico}")
    public String deleteById(@PathVariable("idClienteJuridico") Integer idClienteJuridico) throws Exception {
		clienteJuridicoService.deleteById(idClienteJuridico);
        return "Item eliminado correctamente";
    }
}
