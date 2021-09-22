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

import com.ferreteria.app.entity.AsignarTurnoVendedores;
import com.ferreteria.app.service.AsignarTurnoVendedoresService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/AsignarTurnoVendedores")
public class AsignarTurnoVendedoresController {

	@Autowired
	private AsignarTurnoVendedoresService asignarTurnoVendedoresService;
	
	@ApiOperation(value = "Obtener todos los AsignarTurnoVendedores",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "AsignarTurnoVendedores")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron AsignarTurnoVendedores en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	
	@GetMapping
	public List<AsignarTurnoVendedores> findAll(){
		return asignarTurnoVendedoresService.findAll();
	}
	
	@GetMapping("/{idAsignarTurnoVendedores}")
	public AsignarTurnoVendedores findById(@PathVariable("idAsignarTurnoVendedores") Integer idAsignarTurnoVendedores) throws Exception{
		return asignarTurnoVendedoresService.findById(idAsignarTurnoVendedores);
	}

	@PostMapping
	public @ResponseBody AsignarTurnoVendedores save(@RequestBody AsignarTurnoVendedores asignarTurnoVendedores) {
		return asignarTurnoVendedoresService.save(asignarTurnoVendedores);
		
	}
	
	@PutMapping
	public @ResponseBody AsignarTurnoVendedores update(@RequestBody AsignarTurnoVendedores asignarTurnoVendedores) {
		return asignarTurnoVendedoresService.update(asignarTurnoVendedores);
		
	}
	
	@DeleteMapping("/{idAsignarTurnoVendedores}")
    public String deleteById(@PathVariable("idAsignarTurnoVendedores") Integer idAsignarTurnoVendedores) throws Exception {
		asignarTurnoVendedoresService.deleteById(idAsignarTurnoVendedores);
        return "Item eliminado correctamente";
    }
}
