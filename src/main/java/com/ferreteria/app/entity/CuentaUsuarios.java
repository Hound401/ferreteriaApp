package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description = "Información o propiedes de cuentas de usuario")
@Table(name = "CuentaUsuarios")
public class CuentaUsuarios {

	@Id
	@Column(name = "idCuentaUsuario")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idCuentaUsuario;
	
	@Size ( max = 20, message = "El userName debe tener un maximo de 20 caracteres")
	@NotBlank(message = "userName es requerido")
	@Column(name = "userName", length = 20)
	private String userName;
	
	@Size ( max = 100, message = "La contraseña debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Contraseña es requerida")
	@Column(name = "contraseña", length = 100)
	private String contraseña;
	
	@Column(name = "estado", length = 20)
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado", nullable = false)
	private Empleados empleados;
	
	@ManyToOne
	@JoinColumn(name = "idPerfilSistema", nullable = false)
	private PerfilSistema perfilSistema;

	public Integer getIdCuentaUsuario() {
		return idCuentaUsuario;
	}

	public void setIdCuentaUsuario(Integer idCuentaUsuario) {
		this.idCuentaUsuario = idCuentaUsuario;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public PerfilSistema getPerfilSistema() {
		return perfilSistema;
	}

	public void setPerfilSistema(PerfilSistema perfilSistema) {
		this.perfilSistema = perfilSistema;
	}

	
	
	
}

