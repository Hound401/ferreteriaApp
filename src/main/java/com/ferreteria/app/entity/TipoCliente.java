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
@ApiModel(description = "Información o propiedes del Tipo de Cliente")
@Table(name = "TipoCliente")
public class TipoCliente {

	
	@Id
	@Column(name = "idTipoCliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTipoCliente;
	
	@ApiModelProperty(notes = "El Nombre debe tener un maximo de 100 caracteres")
	@Column(name = "NombreTipoCliente", length = 100)
	@Size ( max = 100, message = "El Nombre debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
	private String NombreTipoCliente;
	
	@ManyToOne
	@JoinColumn(name = "idClienteJuridico", nullable = false)
	private ClienteJuridico clienteJuridico;

	public Integer getIdTipoCliente() {
		return idTipoCliente;
	}

	public void setIdTipoCliente(Integer idTipoCliente) {
		this.idTipoCliente = idTipoCliente;
	}

	public String getNombreTipoCliente() {
		return NombreTipoCliente;
	}

	public void setNombreTipoCliente(String nombreTipoCliente) {
		NombreTipoCliente = nombreTipoCliente;
	}

	public ClienteJuridico getClienteJuridico() {
		return clienteJuridico;
	}

	public void setClienteJuridico(ClienteJuridico clienteJuridico) {
		this.clienteJuridico = clienteJuridico;
	}

	
	
}
