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
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel(description = "Información o propiedes del Empleado")
@Table(name = "Empleados")
public class Empleados {
	
	@Id
	@Column(name = "idEmpleado")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idEmpleado;
	
	@ApiModelProperty(notes = "Nombre dene tener como minimo 100 caracteres")
	@Column(name = "Nombres", length = 100)
	@Size ( max = 100, message = "El nombre debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
	private String Nombres;
	
	@Size ( max = 100, message = "El nombre debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Apellido es requerido")
	@Column(name = "Apellidos", length = 100)
	private String Apellidos;
	
	@ApiModelProperty(notes = "El rut debe tener un minimo de 3 caracteres y maximo de 10")
	@Column(name = "Rut", length = 10)
	@Size (min = 3, max = 10, message = "El rut debe tener un minimo de 3 caracteres y maximo de 10")
	private String Rut;
	
	@ApiModelProperty(notes = "La Dirección debe tener un maximo de 100 caracteres")
	@Column(name = "Direccion", length = 100)
	@Size ( max = 100, message = "La Dirección debe tener un maximo de 100 caracteres")
	private String Direccion;
	
	@ApiModelProperty(notes = "El telefono debe tener un minimo de 1 digito y un maximo de 12")
	@Column(name = "Telefono", length = 12)
	@Size ( min = 1, max = 12, message = "El telefono debe tener un minimo de 1 digito y un maximo de 12")
	private String Telefono;
	
	@ManyToOne
	@JoinColumn(name = "idPerfilSistema", nullable = false)
	private PerfilSistema perfilSistema;

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getRut() {
		return Rut;
	}

	public void setRut(String rut) {
		Rut = rut;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public PerfilSistema getPerfilSistema() {
		return perfilSistema;
	}

	public void setPerfilSistema(PerfilSistema perfilSistema) {
		this.perfilSistema = perfilSistema;
	}
	
	
	
}
