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
@Table(name = "Distrito")
public class Distrito implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idDistrito")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idDistrito;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "idCiudad")
	private Ciudad ciudad;


	
	public Distrito(int idDistrito, String nombre,Ciudad ciudad) {
		super();
		this.idDistrito = idDistrito;
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	
	
	

}
