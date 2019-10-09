package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Distrito;

@Repository
public class DistritoRepository extends AbstractSession implements IDistritoRepository , Serializable{

	private static final long serialVersionUID = 1L;
	@Override
	public boolean insert(Distrito t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Distrito t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Distrito> listAll() {
		return getSession().createQuery("from Distrito").list();
	}

	@Override
	public Distrito finbyId(int id) {
		Distrito dist = new Distrito();
		try {
			dist = getSession().find(Distrito.class, id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return dist;
	}

}
