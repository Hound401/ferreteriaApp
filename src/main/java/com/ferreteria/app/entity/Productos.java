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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;

@Entity
@ApiModel(description = "Información o propiedes de Productos")
@Table(name = "Productos")
public class Productos {

	
	@Id
	@Column(name = "idProducto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer idProducto;
	
	@Column(name = "NombreProducto", length = 100)
	@Size ( max = 100, message = "El nombre del producto debe tener un maximo de 100 caracteres")
	@NotBlank(message = "Nombre es requerido")
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

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Integer getPrecio() {
		return Precio;
	}

	public void setPrecio(Integer precio) {
		Precio = precio;
	}

	public String getStock() {
		return Stock;
	}

	public void setStock(String stock) {
		Stock = stock;
	}

	public LocalDateTime getFechaRegistro() {
		return FechaRegistro;
	}

	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		FechaRegistro = fechaRegistro;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	
}
