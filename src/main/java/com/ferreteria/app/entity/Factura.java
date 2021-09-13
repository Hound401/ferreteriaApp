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
@Table(name = "Factura")
public class Factura {

	@Id
	@Column(name = "idFactura")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idFactura;
	
	@Column(name = "subTotal")
	private BigDecimal subTotal;
	
	@Column(name = "Total")
	private BigDecimal Total;
	
	@Column(name = "IVA")
	private BigDecimal IVA;
	
	@ManyToOne
	@JoinColumn(name = "idTipoComprobante", nullable = false)
	private TipoComprobante tipoComprobante;
	
}
