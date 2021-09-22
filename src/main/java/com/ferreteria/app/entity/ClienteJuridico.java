package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@Entity
@ApiModel(description = "Información o propiedes del ClienteJuridico")
@Table(name = "ClienteJuridico")
public class ClienteJuridico {

	@Id
	@Column(name = "idClienteJuridico")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idClienteJuridico;
	
	@Column(name = "RutEmpresa", length = 14)
	private String RutEmpresa;
	
	@ApiModelProperty(notes = "El Nombre debe tener un maximo de 100 caracteres")
	@Column(name = "NombreEmpresa", length = 100)
	@Size ( max = 100, message = "El Nombre debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
	private String NombreEmpresa;

	public Integer getIdClienteJuridico() {
		return idClienteJuridico;
	}

	public void setIdClienteJuridico(Integer idClienteJuridico) {
		this.idClienteJuridico = idClienteJuridico;
	}

	public String getRutEmpresa() {
		return RutEmpresa;
	}

	public void setRutEmpresa(String rutEmpresa) {
		RutEmpresa = rutEmpresa;
	}

	public String getNombreEmpresa() {
		return NombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		NombreEmpresa = nombreEmpresa;
	}

	
}
