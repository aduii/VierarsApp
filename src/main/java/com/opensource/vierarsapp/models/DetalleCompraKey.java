package com.opensource.vierarsapp.models;

import java.io.Serializable;

import javax.persistence.Column;

public class DetalleCompraKey implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column(name="idMaterialRreciclado")
	int idMaterialRreciclado;
	
	@Column(name="idCompra")
	int idCompra;

	public DetalleCompraKey(int idMaterialRreciclado, int idCompra) {
		super();
		this.idMaterialRreciclado = idMaterialRreciclado;
		this.idCompra = idCompra;
	}
	
	public DetalleCompraKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMaterialRreciclado() {
		return idMaterialRreciclado;
	}

	public void setIdMaterialRreciclado(int idMaterialRreciclado) {
		this.idMaterialRreciclado = idMaterialRreciclado;
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	
	
}
