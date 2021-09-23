package com.ferreteria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferreteria.app.entity.CuentaUsuarios;
import com.ferreteria.app.service.CuentaUsuariosService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/CuentaUsuarios")
public class CuentaUsuariosController {

	@Autowired
	private CuentaUsuariosService cuentaUsuariosService;
	
	
	@ApiOperation(value = "Obtener todos los CuentaUsuarios",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "CuentaUsuarios")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron CuentaUsuarios en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public ResponseEntity<List<CuentaUsuarios>> listar(){
		List<CuentaUsuarios> lista = cuentaUsuariosService.findAll();
		return new ResponseEntity<List<CuentaUsuarios>>(lista, HttpStatus.OK);
	}
	
	@GetMapping("/{idCuentaUsuario}")
	public CuentaUsuarios findById(@PathVariable("idCuentaUsuario") Integer idCuentaUsuario) throws Exception{
		return cuentaUsuariosService.findById(idCuentaUsuario);
	}

	@PostMapping
	public @ResponseBody CuentaUsuarios save(@RequestBody CuentaUsuarios cuentaUsuarios) {
		return cuentaUsuariosService.save(cuentaUsuarios);
		
	}
	
	@PutMapping
	public @ResponseBody CuentaUsuarios update(@RequestBody CuentaUsuarios cuentaUsuarios) {
		return cuentaUsuariosService.update(cuentaUsuarios);
		
	}
	
	@DeleteMapping("/{idCuentaUsuario}")
    public String deleteById(@PathVariable("idCuentaUsuario") Integer idCuentaUsuario) throws Exception {
		cuentaUsuariosService.deleteById(idCuentaUsuario);
        return "Item eliminado correctamente";
    }
}
