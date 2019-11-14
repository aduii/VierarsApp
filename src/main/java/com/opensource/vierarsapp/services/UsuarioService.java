package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

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
	public void insert(Usuario t) {
		_usuarioRepository.save(t);
	}

	@Override
	public void update(Usuario t) {
		_usuarioRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_usuarioRepository.deleteById(id);
	}

	@Override
	public List<Usuario> listAll() {
		
		return _usuarioRepository.findAll();
	}

	@Override
	public Optional<Usuario> finbyId(int id) {
		return _usuarioRepository.findById(id);
	}


}
