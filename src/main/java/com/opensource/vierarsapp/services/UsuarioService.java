package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.IDistritoRepository;
import com.opensource.vierarsapp.dao.IUsuarioRepository;
import com.opensource.vierarsapp.models.Distrito;
import com.opensource.vierarsapp.models.Usuario;

@Service("usuarioService")
@Transactional
public class UsuarioService implements IUsuarioService{

	@Autowired
	private IUsuarioRepository _usuarioRepository;

	@Autowired
	private IDistritoRepository _distritoRepository;
	
	@Override
	public boolean insert(Usuario t) {
		try {
			_usuarioRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Usuario insert(Usuario t, int idDistrito){
		
		Distrito distrito = _distritoRepository.findById(idDistrito).get();
		t.setDistrito(distrito);
		_usuarioRepository.save(t);
		return t;
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
