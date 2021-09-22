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
@ApiModel(description = "Información o propiedes de Tipo de Producto")
@Table(name = "TipoProducto")
public class TipoProducto {

	@Id
	@Column(name = "idTipoProducto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTipoProducto;
	
	@Column(name = "NombreTipoProducto", length = 100)
	@ApiModelProperty(notes = "El Nombre del tipo de producto debe tener un maximo de 100 caracteres")
	@Size ( max = 100, message = "El Nombre del tipo de producto debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
	private String NombreTipoProducto;

	public Integer getIdTipoProducto() {
		return idTipoProducto;
	}

	public void setIdTipoProducto(Integer idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	public String getNombreTipoProducto() {
		return NombreTipoProducto;
	}

	public void setNombreTipoProducto(String nombreTipoProducto) {
		NombreTipoProducto = nombreTipoProducto;
	}
	
	
}
