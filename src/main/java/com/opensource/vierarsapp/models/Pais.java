package com.opensource.vierarsapp.models;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Pais")
public class Pais implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idPais")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idPais;
	
	@Column(name = "nombre")
	private String nombre;


	public Pais() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdPais() {
		return idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Pais(int idPais, String nombre ) {
		this.idPais = idPais;
		this.nombre = nombre;
	}
	
}
