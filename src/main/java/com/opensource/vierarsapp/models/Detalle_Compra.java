package com.opensource.vierarsapp.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_compra")
public class Detalle_Compra implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idDetalleCompra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleCompra;
	
	@Column(name="precioFinal")
	private double precioFinal;
	
	//-------------------------------------------
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idMaterialRreciclado")
	private MateriaReciclado idMaterialRreciclado;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idCompra")
	private Compra idCompra;
	
	//---------------------------------------------
	
	public Detalle_Compra(MateriaReciclado idMaterialRreciclado, Compra idCompra, double precioFinal) {
		super();
		this.idMaterialRreciclado = idMaterialRreciclado;
		this.idCompra = idCompra;
		this.precioFinal = precioFinal;
	}
	
	public Detalle_Compra() {
		super();
	}
	
	public int getIdDetalleCompra() {
		return idDetalleCompra;
	}
	
	public void setIdDetalleCompra(int idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}
	
	public MateriaReciclado getIdMaterialRreciclado() {
		return idMaterialRreciclado;
	}
	
	public void setIdMaterialRreciclado(MateriaReciclado idMaterialRreciclado) {
		this.idMaterialRreciclado = idMaterialRreciclado;
	}
	
	public Compra getIdCompra() {
		return idCompra;
	}
	
	public void setIdCompra(Compra idCompra) {
		this.idCompra = idCompra;
	}
	
}
