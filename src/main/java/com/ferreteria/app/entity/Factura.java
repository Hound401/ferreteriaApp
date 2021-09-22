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

import io.swagger.annotations.ApiModel;


@Entity
@ApiModel(description = "Información o propiedes de la Factura")
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

	public Integer getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(Integer idFactura) {
		this.idFactura = idFactura;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotal() {
		return Total;
	}

	public void setTotal(BigDecimal total) {
		Total = total;
	}

	public BigDecimal getIVA() {
		return IVA;
	}

	public void setIVA(BigDecimal iVA) {
		IVA = iVA;
	}

	public TipoComprobante getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(TipoComprobante tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}
	
	
	
}
