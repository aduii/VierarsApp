package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Ciudad;

@Repository
public class CiudadRepository extends AbstractSession implements ICiudadRepository, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean insert(Ciudad t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Ciudad t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Ciudad> listAll() {
		return getSession().createQuery("from Ciudad").list();
	}

	@Override
	public Ciudad finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
