package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity
@Table(name = "ClienteJuridico")
public class ClienteJuridico {

	@Id
	@Column(name = "idClienteJuridico")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idClienteJuridico;
	
	@Column(name = "RutEmpresa", length = 14)
	private String RutEmpresa;
	
	@Column(name = "NombreEmpresa", length = 100)
	@Size ( max = 100, message = "El Nombre debe tener un maximo de 100 caracteres")
	private String NombreEmpresa;

	
}
