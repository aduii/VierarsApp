package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Pais;

@Repository
public class PaisRepository extends AbstractSession implements IPaisRepository, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(Pais t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Pais t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Pais> listAll() {
		return getSession().createQuery("from Pais").list();
	}

	@Override
	public Pais finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
