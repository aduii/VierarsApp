package com.opensource.vierarsapp.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Compra")
public class Compra implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idCompra")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int idCompra;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "tipo_de_pago")
	private String tipo_de_pago;
	
	@Column(name = "monto_total")
	private double monto_total;
	
	//---------------------------------------------
	
	@ManyToOne
	@JoinColumn(name = "idReciclador")
	private Usuario reciclador;

	@ManyToOne
	@JoinColumn(name = "idMaterialReciclado")
	private MateriaReciclado materialReciclado;
	//---------------------------------------------
	
	public Compra(int idCompra, Date fecha, String tipo_de_pago, double monto_total, Usuario reciclador, MateriaReciclado materialReciclado) {
		super();
		this.idCompra = idCompra;
		this.fecha = fecha;
		this.tipo_de_pago = tipo_de_pago;
		this.monto_total = monto_total;
		this.reciclador = reciclador; 
		this.materialReciclado = materialReciclado;
	}

	public Compra() {
		super();
	}

	public int getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTipo_de_pago() {
		return tipo_de_pago;
	}

	public void setTipo_de_pago(String tipo_de_pago) {
		this.tipo_de_pago = tipo_de_pago;
	}

	public double getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}

	public Usuario getReciclador() {
		return reciclador;
	}

	public void setReciclador(Usuario reciclador) {
		this.reciclador = reciclador;
	}

	public MateriaReciclado getMaterialReciclado() {
		return materialReciclado;
	}

	public void setMaterialReciclado(MateriaReciclado materialReciclado) {
		this.materialReciclado = materialReciclado;
	}

	
	
}
