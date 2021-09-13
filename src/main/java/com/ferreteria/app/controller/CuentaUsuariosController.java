package com.ferreteria.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@RestController
@RequestMapping("/CuentaUsuarios")
public class CuentaUsuariosController {

	@Autowired
	private CuentaUsuariosService cuentaUsuariosService;
	
	@GetMapping
	public List<CuentaUsuarios> findAll(){
		return cuentaUsuariosService.findAll();
	}
	
	@GetMapping("/{idCuentaUsuario}")
	public CuentaUsuarios findById(@PathVariable("idCuentaUsuario") Integer idCuentaUsuario){
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
}
