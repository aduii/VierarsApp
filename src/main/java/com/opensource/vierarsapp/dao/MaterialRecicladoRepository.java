package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.MaterialReciclado;

@Repository
public class MaterialRecicladoRepository extends AbstractSession implements IMaterialRecicladoRepository, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(MaterialReciclado t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MaterialReciclado t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MaterialReciclado> listAll() {
		return getSession().createQuery("from MaterialReciclado").list();
	}

	@Override
	public MaterialReciclado finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
