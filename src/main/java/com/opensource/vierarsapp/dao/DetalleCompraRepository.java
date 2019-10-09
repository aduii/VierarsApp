package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.DetalleCompra;

@Repository
public class DetalleCompraRepository extends AbstractSession implements IDetalleCompraRepository, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(DetalleCompra t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(DetalleCompra t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DetalleCompra> listAll() {
		return getSession().createQuery("from DetalleCompra").list();
	}

	@Override
	public DetalleCompra finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
