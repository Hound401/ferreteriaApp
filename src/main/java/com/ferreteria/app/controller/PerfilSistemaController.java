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

import com.ferreteria.app.entity.PerfilSistema;
import com.ferreteria.app.service.PerfilSistemaService;

@RestController
@RequestMapping("/PerfilSistema")
public class PerfilSistemaController {

	@Autowired
	private PerfilSistemaService perfilSistemaService;
	
	@GetMapping
	public List<PerfilSistema> findAll(){
		return perfilSistemaService.findAll();
	}
	
	@GetMapping("/{idPerfilSistema}")
	public PerfilSistema findById(@PathVariable("idPerfilSistema") Integer idPerfilSistema) throws Exception{
		return perfilSistemaService.findById(idPerfilSistema);
	}

	@PostMapping
	public @ResponseBody PerfilSistema save(@RequestBody PerfilSistema perfilSistema) {
		return perfilSistemaService.save(perfilSistema);
		
	}
	
	@PutMapping
	public @ResponseBody PerfilSistema update(@RequestBody PerfilSistema perfilSistema) {
		return perfilSistemaService.update(perfilSistema);
		
	}
	
	@DeleteMapping("/{idPerfilSistema}")
    public String deleteById(@PathVariable("idPerfilSistema") Integer idPerfilSistema) throws Exception {
		perfilSistemaService.deleteById(idPerfilSistema);
        return "Item eliminado correctamente";
    }
}
