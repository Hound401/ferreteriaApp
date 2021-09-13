package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TipoComprobante")
public class TipoComprobante {

	@Id
	@Column(name = "idTipoComprobante")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idTipoComprobante;
	
	@Column(name = "NombreTipoComprobante", length = 100)
	private String NombreTipoComprobante;
	
}
