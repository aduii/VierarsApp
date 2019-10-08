package com.opensource.vierarsapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ciudad")
public class Ciudad implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idCiudad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idCiudad;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "idPais")
	private int idPais;

	
	public Ciudad(int idCiudad, String nombre,int idPais) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.idPais = idPais;
	}

	public Ciudad() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCiudad() {
		return idCiudad;
	}

	public void setIdCiudad(int idCiudad) {
		this.idCiudad = idCiudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	

}
