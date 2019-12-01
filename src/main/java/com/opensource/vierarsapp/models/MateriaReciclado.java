package com.opensource.vierarsapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "MateriaReciclado")
public class MateriaReciclado implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idMaterialReciclado")
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
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "idTipo")
	private Tipo tipo;

	@Column(name = "esta_vendido")
	private int esta_vendido;

	
	public MateriaReciclado(int idMaterialRreciclado, String nombre, String descripcion, String foto, double precio, double peso, Usuario usuario,Tipo tipo, int esta_vendido) {
		super();
		this.idMaterialRreciclado = idMaterialRreciclado;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.foto = foto;
		this.precio = precio;
		this.peso = peso;
		this.usuario = usuario;
		this.tipo = tipo;
		this.esta_vendido = esta_vendido;
	}

	public MateriaReciclado() {
		super();
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public int getEsta_vendido() {
		return esta_vendido;
	}

	//si esta vendido va 1, si no va 0
	public void setEsta_vendido(int esta_vendido) {
		this.esta_vendido = esta_vendido;
	}

	
}