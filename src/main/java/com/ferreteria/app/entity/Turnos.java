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
@ApiModel(description = "Información o propiedes de Turnos")
@Table(name = "Turnos")
public class Turnos {

	@Id
	@Column(name = "idTurno")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTurno;
	
	@ApiModelProperty(notes = "El Nombre del turno del tipo de producto debe tener un maximo de 100 caracteres")
	@Column(name = "NombreTurno", length = 100)
	@Size ( max = 100, message = "El Nombre del turno del tipo de producto debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
	private String NombreTurno;

	public Integer getIdTurno() {
		return idTurno;
	}

	public void setIdTurno(Integer idTurno) {
		this.idTurno = idTurno;
	}

	public String getNombreTurno() {
		return NombreTurno;
	}

	public void setNombreTurno(String nombreTurno) {
		NombreTurno = nombreTurno;
	}
	
	
}
