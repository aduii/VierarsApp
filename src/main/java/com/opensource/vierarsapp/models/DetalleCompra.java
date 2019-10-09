package com.opensource.vierarsapp.models;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "DetalleCompra")
public class DetalleCompra {

	@EmbeddedId
	DetalleCompraKey id;
	
	@ManyToOne
	@MapsId("idMaterialRreciclado")
	@JoinColumn(name ="idMaterialRreciclado")
	MateriaReciclado materiareciclado;
	
	@ManyToOne
	@MapsId("idCompra")
	@JoinColumn(name="idCompra")
	Compra compra;
	
	@Column(name = "precio_final")
	double precio_final;

	public DetalleCompra(DetalleCompraKey id, MateriaReciclado materiareciclado, Compra compra, double precio_final) {
		super();
		this.id = id;
		this.materiareciclado = materiareciclado;
		this.compra = compra;
		this.precio_final = precio_final;
	}
	
	public DetalleCompra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetalleCompraKey getId() {
		return id;
	}

	public void setId(DetalleCompraKey id) {
		this.id = id;
	}

	public MateriaReciclado getMateriareciclado() {
		return materiareciclado;
	}

	public void setMateriareciclado(MateriaReciclado materiareciclado) {
		this.materiareciclado = materiareciclado;
	}

	public Compra getCompra() {
		return compra;
	}

	public void setCompra(Compra compra) {
		this.compra = compra;
	}

	public double getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}
}
