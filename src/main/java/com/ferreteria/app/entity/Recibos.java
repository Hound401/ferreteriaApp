package com.ferreteria.app.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Recibos")
public class Recibos {
	
	@Id
	@Column(name = "idRecibo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idRecibo;
	
	@Column(name = "Total")
	private BigDecimal Total;
	
	@ManyToOne
	@JoinColumn(name = "idTipoComprobante", nullable = false)
	private TipoComprobante tipoComprobante;
	
}
