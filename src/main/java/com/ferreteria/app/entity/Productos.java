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
import javax.validation.constraints.Size;

@Entity
@Table(name = "Productos")
public class Productos {

	
	@Id
	@Column(name = "idProducto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idProducto;
	
	@Column(name = "NombreProducto", length = 100)
	@Size ( max = 100, message = "El nombre del producto debe tener un maximo de 100 caracteres")
	private String NombreProducto;
	
	@Column(name = "Descripcion", length = 100)
	private String Descripcion;
	
	@Column(name = "Precio")
	private Integer Precio;
	
	@Column(name = "Stock", length = 100)
	private String Stock;
	
	@Column(name = "FechaRegistro")
	private LocalDateTime FechaRegistro;
	
	@ManyToOne
	@JoinColumn(name = "idTipoProducto", nullable = false)
	private TipoProducto tipoProducto;
}
