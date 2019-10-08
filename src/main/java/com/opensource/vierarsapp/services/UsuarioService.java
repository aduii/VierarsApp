package com.opensource.vierarsapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.IUsuarioRepository;
import com.opensource.vierarsapp.models.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioRepository _usuarioRepository;
	
	@Override
	public boolean insert(Usuario t) {
		return _usuarioRepository.insert(t);
	}

	@Override
	public boolean update(Usuario t) {
		
		return _usuarioRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		
		return _usuarioRepository.delete(id);
	}

	@Override
	public List<Usuario> listAll() {
		
		return _usuarioRepository.listAll();
	}

	@Override
	public Usuario finbyId(int id) {
		
		return _usuarioRepository.finbyId(id);
	}

}
