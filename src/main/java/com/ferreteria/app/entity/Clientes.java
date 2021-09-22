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
@ApiModel(description = "Información o propiedes del Cliente")
@Table(name = "Clientes")
public class Clientes {
	
	@Id
	@Column(name = "idCliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idCliente;
	
	@Column(name = "Direccion", length = 100)
	private String Direccion;
	
	@Column(name = "Telefono", length = 16)
	@Size ( max = 100, message = "El Telefono debe tener un maximo de 16 caracteres")
	@ApiModelProperty(value = "Telefono debe tener como minimo 16 caracteres")
	@NotBlank(message = "Telefono es requerido")
	private String Telefono;
	
	@Column(name = "Email", length = 100)
	private String Email;
	
	@ManyToOne
	@JoinColumn(name = "idTipoCliente", nullable = false)
	private Clientes idTipoCliente;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Clientes getIdTipoCliente() {
		return idTipoCliente;
	}

	public void setIdTipoCliente(Clientes idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}
	
	
}
