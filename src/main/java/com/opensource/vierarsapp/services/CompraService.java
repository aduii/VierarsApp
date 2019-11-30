package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.ICompraRepository;
import com.opensource.vierarsapp.dao.IUsuarioRepository;
import com.opensource.vierarsapp.models.Compra;
import com.opensource.vierarsapp.models.Usuario;

@Service("compraService")
@Transactional
public class CompraService implements ICompraService{

	@Autowired
	private ICompraRepository _compraRepository;
	
	@Autowired
	private IUsuarioRepository _usuarioRepository;

	@Override
	public boolean insert(Compra t) {
		try {
			_compraRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
public Compra insert(  Compra t, int idReciclador,int idUsuario){
		
	   Usuario usuario = _usuarioRepository.findById(idUsuario).get();
		Usuario reciclador = _usuarioRepository.findById(idReciclador).get();
		t.setReciclador(reciclador);
		t.setUsuario(usuario);
		
		_compraRepository.save(t);
		return t;
	}

	@Override
	public void update(Compra t) {
		_compraRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_compraRepository.deleteById(id);
	}

	@Override
	public List<Compra> listAll() {
		return _compraRepository.findAll();
	}

	@Override
	public Optional<Compra> finbyId(int id) {
		return _compraRepository.findById(id);
	}


	
	
}
