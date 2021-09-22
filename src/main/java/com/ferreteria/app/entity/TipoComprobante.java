package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description = "Información o propiedes del Tipo de Comprobante")
@Table(name = "TipoComprobante")
public class TipoComprobante {

	@Id
	@Column(name = "idTipoComprobante")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTipoComprobante;
	
	@Column(name = "NombreTipoComprobante", length = 100)
	private String NombreTipoComprobante;

	public Integer getIdTipoComprobante() {
		return idTipoComprobante;
	}

	public void setIdTipoComprobante(Integer idTipoComprobante) {
		this.idTipoComprobante = idTipoComprobante;
	}

	public String getNombreTipoComprobante() {
		return NombreTipoComprobante;
	}

	public void setNombreTipoComprobante(String nombreTipoComprobante) {
		NombreTipoComprobante = nombreTipoComprobante;
	}

	
	
}
