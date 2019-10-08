package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Compra;

@Repository
public class CompraRepository extends AbstractSession implements ICompraRepository, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(Compra t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Compra t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Compra> listAll() {
		return getSession().createQuery("from Compra").list();
	}

	@Override
	public Compra finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
