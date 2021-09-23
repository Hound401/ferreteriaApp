package com.ferreteria.app.DTO;

import java.io.Serializable;

import org.springframework.hateoas.ResourceSupport;

import com.ferreteria.app.entity.Clientes;
import com.ferreteria.app.entity.Empleados;

public class VentasDTO extends ResourceSupport implements Serializable {

	private Integer idVenta;
	private Empleados empleados;
	private Clientes clientes;
	
	public Integer getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(Integer idVenta) {
		this.idVenta = idVenta;
	}
	public Empleados getEmpleados() {
		return empleados;
	}
	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}
	public Clientes getClientes() {
		return clientes;
	}
	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}
	
	
	
	
	
	
	
}
