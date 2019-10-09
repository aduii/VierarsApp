package com.opensource.vierarsapp.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "MateriaReciclado")
public class MateriaReciclado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idMaterialRreciclado")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMaterialRreciclado;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "peso")
	private double peso;
	
	@Column(name="idUsuario")
	private int idUsuario;
	
	//---------------------------------------------
	@OneToMany
	@JoinColumn(name = "idMaterialRreciclado")
	private Set<DetalleCompra> compras;
	//---------------------------------------------
	
	public MateriaReciclado(int idMaterialRreciclado, String nombre, String descripcion, String foto, double precio, double peso, int idUsuario) {
		super();
		this.idMaterialRreciclado = idMaterialRreciclado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto = foto;
		this.precio = precio;
		this.peso = peso;
		this.idUsuario = idUsuario;
	}

	public MateriaReciclado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMaterialRreciclado() {
		return idMaterialRreciclado;
	}

	public void setIdMaterialRreciclado(int idMaterialRreciclado) {
		this.idMaterialRreciclado = idMaterialRreciclado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
}