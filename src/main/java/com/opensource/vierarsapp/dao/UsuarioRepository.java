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
		try {
			getSession().persist(t);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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
	
	@Override
	public Usuario finbyEmail(String Email) {
		Usuario user = new Usuario();
		try {
			user = getSession().find(Usuario.class, Email);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}

}
