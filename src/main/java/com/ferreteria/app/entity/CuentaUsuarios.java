package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CuentaUsuarios")
public class CuentaUsuarios {

	@Id
	@Column(name = "idCuentaUsuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idCuentaUsuario;
	
	@Column(name = "contraseña", length = 100)
	private String contraseña;
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado", nullable = false)
	private Empleados empleados;
	
	@ManyToOne
	@JoinColumn(name = "idPerfilSistema", nullable = false)
	private PerfilSistema perfilSistema;
}

