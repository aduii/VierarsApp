package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.MateriaReciclado;

@Repository
public class MateriaRecicladoRepository extends AbstractSession implements IMaterialRecicladoRepository, Serializable{

	private static final long serialVersionUID = 1L;

	@Override
	public boolean insert(MateriaReciclado t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(MateriaReciclado t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<MateriaReciclado> listAll() {
		return getSession().createQuery("from MateriaReciclado").list();
	}

	@Override
	public MateriaReciclado finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
