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

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description = "Información o propiedes de Ventas")
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

	public Integer getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}

	public Integer getNumeroComprobante() {
		return NumeroComprobante;
	}

	public void setNumeroComprobante(Integer numeroComprobante) {
		NumeroComprobante = numeroComprobante;
	}

	public LocalDateTime getFechaEmitida() {
		return FechaEmitida;
	}

	public void setFechaEmitida(LocalDateTime fechaEmitida) {
		FechaEmitida = fechaEmitida;
	}

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public TipoComprobante getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(TipoComprobante tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	
}
