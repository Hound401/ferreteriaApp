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

@RestController
@RequestMapping("/AsignarTurnoVendedores")
public class AsignarTurnoVendedoresController {

	@Autowired
	private AsignarTurnoVendedoresService asignarTurnoVendedoresService;
	
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
