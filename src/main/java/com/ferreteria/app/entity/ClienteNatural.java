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
@ApiModel(description = "Información o propiedes del Cliente Natural")
@Table(name = "ClienteNatural")
public class ClienteNatural {

	@Id
	@Column(name = "idClienteNatural")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idClienteNatural;
	
	@Column(name = "RutCN", length = 100)
	private String RutCN;
	
	@Column(name = "NombresCN", length = 100)
	@ApiModelProperty(notes = "El Nombre debe tener un maximo de 100 caracteres")
	@Size ( max = 100, message = "El Nombre debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
	private String NombresCN;
	
	@ApiModelProperty(notes = "El Apellido debe tener un maximo de 100 caracteres")
	@Column(name = "ApellidosCN", length = 100)
	@Size ( max = 100, message = "El Apellido debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Apellido es requerido")
	private String ApellidosCN;
	
	@ManyToOne
	@JoinColumn(name = "idTipoCliente", nullable = false)
	private TipoCliente tipoCliente;

	public Integer getIdClienteNatural() {
		return idClienteNatural;
	}

	public void setIdClienteNatural(Integer idClienteNatural) {
		this.idClienteNatural = idClienteNatural;
	}

	public String getRutCN() {
		return RutCN;
	}

	public void setRutCN(String rutCN) {
		RutCN = rutCN;
	}

	public String getNombresCN() {
		return NombresCN;
	}

	public void setNombresCN(String nombresCN) {
		NombresCN = nombresCN;
	}

	public String getApellidosCN() {
		return ApellidosCN;
	}

	public void setApellidosCN(String apellidosCN) {
		ApellidosCN = apellidosCN;
	}

	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	
}
