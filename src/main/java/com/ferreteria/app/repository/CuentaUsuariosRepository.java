package com.ferreteria.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ferreteria.app.entity.CuentaUsuarios;

@Repository
public interface CuentaUsuariosRepository extends JpaRepository<CuentaUsuarios, Integer>{

	CuentaUsuarios findOneByUserName(String userName);
	
}
