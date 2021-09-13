package com.ferreteria.app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ventas")
public class Ventas {

	@Id
	@Column(name = "idVenta")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idVenta;
	
	@Column(name = "NumeroComprobante")
	private Integer NumeroComprobante;
	
	@Column(name = "FechaEmitida")
	private LocalDateTime FechaEmitida;
	
	@ManyToOne
	@JoinColumn(name = "idEmpleado", nullable = false)
	private Empleados empleados;
	
	@ManyToOne
	@JoinColumn(name = "idTipoComprobante", nullable = false)
	private TipoComprobante tipoComprobante;
	
	@ManyToOne
	@JoinColumn(name = "idClientes", nullable = false)
	private Clientes clientes;
}
