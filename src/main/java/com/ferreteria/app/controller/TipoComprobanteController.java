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

import com.ferreteria.app.entity.TipoComprobante;
import com.ferreteria.app.service.TipoComprobanteService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/TipoComprobante")
public class TipoComprobanteController {

	@Autowired
	private TipoComprobanteService tipoComprobanteService;
	
	
	@ApiOperation(value = "Obtener todos los TipoComprobante",
            notes = "No necesita parametros de entrada",
            response = List.class,
            responseContainer = "TipoComprobante")
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Bad request o datos no enviados correctamente"),
            @ApiResponse(code = 404, message = "Not found, no encontrado"),
            @ApiResponse(code = 405, message = "No se encontraron TipoComprobante en la BD"),
            @ApiResponse(code = 200, message = "Peticón OK")})
	@GetMapping
	public List<TipoComprobante> findAll(){
		return tipoComprobanteService.findAll();
	}
	
	@GetMapping("/{idTipoComprobante}")
	public TipoComprobante findById(@PathVariable("idTipoComprobante") Integer idTipoComprobante) throws Exception{
		return tipoComprobanteService.findById(idTipoComprobante);
	}

	@PostMapping
	public @ResponseBody TipoComprobante save(@RequestBody TipoComprobante tipoComprobante) {
		return tipoComprobanteService.save(tipoComprobante);
		
	}
	
	@PutMapping
	public @ResponseBody TipoComprobante update(@RequestBody TipoComprobante tipoComprobante) {
		return tipoComprobanteService.update(tipoComprobante);
		
	}
	
	@DeleteMapping("/{idTipoComprobante}")
    public String deleteById(@PathVariable("idTipoComprobante") Integer idTipoComprobante) throws Exception {
		tipoComprobanteService.deleteById(idTipoComprobante);
        return "Item eliminado correctamente";
    }
}
