package com.opensource.vierarsapp.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Usuario;

@Repository
public class UsuarioRepository extends AbstractSession implements IUsuarioRepository , Serializable{

	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean insert(Usuario t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Usuario t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Usuario> listAll() {
		return getSession().createQuery("from Usuario").list();
	}

	@Override
	public Usuario finbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
