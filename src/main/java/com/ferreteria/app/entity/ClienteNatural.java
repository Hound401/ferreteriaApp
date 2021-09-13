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
@Table(name = "ClienteNatural")
public class ClienteNatural {

	@Id
	@Column(name = "idClienteNatural")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idClienteNatural;
	
	@Column(name = "RutCN", length = 100)
	private String RutCN;
	
	@Column(name = "NombresCN", length = 100)
	@Size ( max = 100, message = "El Nombre debe tener un maximo de 100 caracteres")
	private String NombresCN;
	
	@Column(name = "ApellidosCN", length = 100)
	@Size ( max = 100, message = "El Apellido debe tener un maximo de 100 caracteres")
	private String ApellidosCN;
	
	@ManyToOne
	@JoinColumn(name = "idTipoCliente", nullable = false)
	private TipoCliente tipoCliente;
	
}
