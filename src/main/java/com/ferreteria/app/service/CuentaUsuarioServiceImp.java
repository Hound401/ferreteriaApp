package com.ferreteria.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.ferreteria.app.entity.CuentaUsuarios;
import com.ferreteria.app.repository.CuentaUsuariosRepository;

@Service
public class CuentaUsuarioServiceImp implements UserDetailsService,CuentaUsuariosService {
	
	@Autowired
	private CuentaUsuariosRepository cuentaUsuariosRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		CuentaUsuarios cuentaUsuario = cuentaUsuariosRepository.findOneByUserName(userName);
		if(cuentaUsuario == null) {
			throw new UsernameNotFoundException(String.format("Usuario no existe", userName));
		}

		List<GrantedAuthority> NombrePerfil = new ArrayList<>();
		NombrePerfil.add(new SimpleGrantedAuthority(cuentaUsuario.getPerfilSistema().getNombrePerfil()));

		UserDetails ud = new User(cuentaUsuario.getuserName(), cuentaUsuario.getContraseña(), NombrePerfil);
		return ud;
	}
	
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
	
	@Override
	public boolean deleteById(Integer idCuentaUsuario) throws Exception {
        Optional<CuentaUsuarios> optionalCU = cuentaUsuariosRepository.findById(idCuentaUsuario);
        if(!optionalCU.isPresent()){
            throw new Exception("ID NO ENCONTRADO: " + idCuentaUsuario);
        }
        cuentaUsuariosRepository.deleteById(idCuentaUsuario);
        return true;
    }

}
