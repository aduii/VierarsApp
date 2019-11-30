package com.opensource.vierarsapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tipo")
public class Tipo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idTipo")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idTipo;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "tarifa_kilo")
	private String tarifa_kilo;
	
	public Tipo(int idTipo, String nombre, String tarifa_kilo) {
		super();
		this.idTipo = idTipo;
		this.nombre = nombre;
		this.tarifa_kilo = tarifa_kilo;
	}
	
	public Tipo() {
		super();
	}

	public int getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTarifa_kilo() {
		return tarifa_kilo;
	}

	public void setTarifa_kilo(String tarifa_kilo) {
		this.tarifa_kilo = tarifa_kilo;
	}

	
}
