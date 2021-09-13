package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PerfilSistema")
public class PerfilSistema {

	@Id
	@Column(name = "idPerfilSistema")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idPerfilSistema;
	
	@Column(name = "NombrePerfil")
	private Integer NombrePerfil;
}
