package com.ferreteria.app.DTO;

import com.ferreteria.app.entity.Empleados;
import com.ferreteria.app.entity.Ventas;

public class VentasDTO {

	private Integer idVenta;
	private Empleados empleados;
	private Ventas ventas;
	
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVentas(Integer idVentas) {
		this.idVenta = idVentas;
	}
	public Empleados getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}
	public Ventas getVentas() {
		return ventas;
	}
	public void setVentas(Ventas ventas) {
		this.ventas = ventas;
	}
	
	
	
}
