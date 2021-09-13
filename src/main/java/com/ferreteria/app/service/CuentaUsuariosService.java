package com.ferreteria.app.service;

import java.util.List;

import com.ferreteria.app.entity.CuentaUsuarios;

public interface CuentaUsuariosService {

	List<CuentaUsuarios> findAll();
	
	CuentaUsuarios findById(Integer idCuentaUsuario);
	
	CuentaUsuarios save(CuentaUsuarios cuentaUsuarios);
	
	CuentaUsuarios update(CuentaUsuarios cuentaUsuarios);
}
