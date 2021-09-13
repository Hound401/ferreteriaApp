package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TipoProducto")
public class TipoProducto {

	@Id
	@Column(name = "idTipoProducto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTipoProducto;
	
	@Column(name = "NombreTipoProducto", length = 100)
	@Size ( max = 100, message = "El Nombre del tipo de producto debe tener un maximo de 100 caracteres")
	private String NombreTipoProducto;
}
