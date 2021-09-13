package com.ferreteria.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AsignarTurnoVendedores")
public class AsignarTurnoVendedores {

	@Id
	@Column(name = "idAsignarTurnoVendedores")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idAsignarTurnoVendedores;
	
	@OneToOne
	@JoinColumn(name = "idEmpleado", nullable = false)
	private Empleados empleados;
	
	@ManyToOne
	@JoinColumn(name = "idTurno", nullable = false)
	private Turnos turnos;

	public Integer getIdAsignarTurnoVendedores() {
		return idAsignarTurnoVendedores;
	}

	public void setIdAsignarTurnoVendedores(Integer idAsignarTurnoVendedores) {
		this.idAsignarTurnoVendedores = idAsignarTurnoVendedores;
	}

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public Turnos getTurnos() {
		return turnos;
	}

	public void setTurnos(Turnos turnos) {
		this.turnos = turnos;
	}
	
	
}
