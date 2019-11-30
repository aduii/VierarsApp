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
@Table(name = "Ciudad")
public class Ciudad implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idCiudad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idCiudad;
	
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "idPais")
	private Pais pais;


	
	public Ciudad(int idCiudad, String nombre,Pais pais) {
		super();
		this.idCiudad = idCiudad;
		this.nombre = nombre;
		this.pais = pais;
	}

	public Ciudad() {
		super();
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

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}


	

}
