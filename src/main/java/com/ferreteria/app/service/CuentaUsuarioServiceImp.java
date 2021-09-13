package com.ferreteria.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferreteria.app.entity.CuentaUsuarios;
import com.ferreteria.app.repository.CuentaUsuariosRepository;

@Service
public class CuentaUsuarioServiceImp implements CuentaUsuariosService {
	
	@Autowired
	private CuentaUsuariosRepository cuentaUsuariosRepository;
	
	@Override
	public List<CuentaUsuarios> findAll() {
		
		return cuentaUsuariosRepository.findAll();
	}

	@Override
	public CuentaUsuarios findById(Integer idCuentaUsuario) {
		
		Optional<CuentaUsuarios> cuentaUsuariosO = cuentaUsuariosRepository.findById(idCuentaUsuario);
		return cuentaUsuariosO.isPresent() ? cuentaUsuariosO.get() : new CuentaUsuarios();
	}

	@Override
	public CuentaUsuarios save(CuentaUsuarios cuentaUsuarios) {
		
		return cuentaUsuariosRepository.save(cuentaUsuarios);
	}

	@Override
	public CuentaUsuarios update(CuentaUsuarios cuentaUsuarios) {
		
		return cuentaUsuariosRepository.save(cuentaUsuarios);
	}

}
