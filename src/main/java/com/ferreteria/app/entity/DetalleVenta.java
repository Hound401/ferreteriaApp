package com.ferreteria.app.entity;

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
@ApiModel(description = "Información o propiedes del Detalle de la Venta")
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

	public Integer getIdDetalleVenta() {
		return idDetalleVenta;
	}

	public void setIdDetalleVenta(Integer idDetalleVenta) {
		this.idDetalleVenta = idDetalleVenta;
	}

	public Integer getUnidades() {
		return Unidades;
	}

	public void setUnidades(Integer unidades) {
		Unidades = unidades;
	}

	public String getImporte() {
		return Importe;
	}

	public void setImporte(String importe) {
		Importe = importe;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Ventas getVentas() {
		return ventas;
	}

	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}
	
	
}
