package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Turnos")
public class Turnos {

	@Id
	@Column(name = "idTurno")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTurno;
	
	@Column(name = "NombreTurno", length = 100)
	@Size ( max = 100, message = "El Nombre del turno del tipo de producto debe tener un maximo de 100 caracteres")
	private String NombreTurno;
}
