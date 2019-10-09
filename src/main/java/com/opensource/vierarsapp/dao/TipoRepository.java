package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Tipo;

@Repository
public class TipoRepository extends AbstractSession implements ITipoRepository, Serializable {

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(Tipo t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Tipo t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Tipo> listAll() {
		return getSession().createQuery("from Tipo").list();
	}

	@Override
	public Tipo finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
