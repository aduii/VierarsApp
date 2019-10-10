package com.opensource.vierarsapp.models;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "idReciclador")
	private Usuario reciclador;
	//---------------------------------------------
	
	public Compra(int idCompra, Date fecha, String tipo_de_pago, double monto_total, Usuario usuario,Usuario reciclador) {
		super();
		this.idCompra = idCompra;
		this.fecha = fecha;
		this.tipo_de_pago = tipo_de_pago;
		this.monto_total = monto_total;
		this.usuario = usuario;
		this.reciclador = reciclador; //CAMBIE ESTO DE idReciclador
	}

	public Compra() {
		super();
		// TODO Auto-generated constructor stub
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getReciclador() {
		return reciclador;
	}

	public void setReciclador(Usuario reciclador) {
		this.reciclador = reciclador;
	}

	
	
}
