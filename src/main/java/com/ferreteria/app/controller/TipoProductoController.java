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

import com.ferreteria.app.entity.TipoProducto;
import com.ferreteria.app.service.TipoProductoService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/TipoProducto")
public class TipoProductoController {

	@Autowired
	private TipoProductoService tipoProductoService;
	
	
	@ApiOperation(value = "Obtener todos los TipoProducto",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "TipoProducto")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron TipoProducto en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	@GetMapping
	public List<TipoProducto> findAll(){
		return tipoProductoService.findAll();
	}
	
	@GetMapping("/{idTipoProducto}")
	public TipoProducto findById(@PathVariable("idTipoProducto") Integer idTipoProducto) throws Exception{
		return tipoProductoService.findById(idTipoProducto);
	}

	@PostMapping
	public @ResponseBody TipoProducto save(@RequestBody TipoProducto tipoProducto) {
		return tipoProductoService.save(tipoProducto);
		
	}
	
	@PutMapping
	public @ResponseBody TipoProducto update(@RequestBody TipoProducto tipoProducto) {
		return tipoProductoService.update(tipoProducto);
		
	}
	
	@DeleteMapping("/{idTipoProducto}")
    public String deleteById(@PathVariable("idTipoProducto") Integer idTipoProducto) throws Exception {
		tipoProductoService.deleteById(idTipoProducto);
        return "Item eliminado correctamente";
    }
}
