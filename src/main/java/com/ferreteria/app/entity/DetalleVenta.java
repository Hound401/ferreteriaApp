package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleVenta")
public class DetalleVenta {

	
	@Id
	@Column(name = "idDetalleVenta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idDetalleVenta;
	
	@Column(name = "Unidades")
	private Integer Unidades;
	
	@Column(name = "Importe", length = 100)
	private String Importe;
	
	@ManyToOne
	@JoinColumn(name = "idTipoProducto", nullable = false)
	private TipoProducto tipoProducto;
	
	@ManyToOne
	@JoinColumn(name = "idVenta", nullable = false)
	private Ventas ventas;
}
