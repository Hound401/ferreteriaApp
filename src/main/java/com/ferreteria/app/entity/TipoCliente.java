package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TipoCliente")
public class TipoCliente {

	
	@Id
	@Column(name = "idTipoCliente")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTipoCliente;
	
	@Column(name = "NombreTipoCliente", length = 100)
	@Size ( max = 100, message = "El Nombre debe tener un maximo de 100 caracteres")
	private String NombreTipoCliente;
	
	@ManyToOne
	@JoinColumn(name = "idClienteJuridico", nullable = false)
	private ClienteJuridico clienteJuridico;

}
