package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Detalle_Compra;

@Repository
public class DetalleCompraRepository extends AbstractSession implements IDetalleCompraRepository, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(Detalle_Compra t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Detalle_Compra t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Detalle_Compra> listAll() {
		return getSession().createQuery("from Detalle_Compra").list();
	}

	@Override
	public Detalle_Compra finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
