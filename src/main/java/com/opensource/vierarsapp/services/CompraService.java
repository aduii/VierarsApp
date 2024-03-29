package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.ICompraRepository;
import com.opensource.vierarsapp.dao.IMaterialRecicladoRepository;
import com.opensource.vierarsapp.dao.IUsuarioRepository;
import com.opensource.vierarsapp.models.Compra;
import com.opensource.vierarsapp.models.MateriaReciclado;
import com.opensource.vierarsapp.models.Usuario;

@Service("compraService")
@Transactional
public class CompraService implements ICompraService{

	@Autowired
	private ICompraRepository _compraRepository;
	
	@Autowired
	private IUsuarioRepository _usuarioRepository;

	@Autowired
	private IMaterialRecicladoRepository _materialrecicladoRepository;

	@Override
	public boolean insert(final Compra t) {
		try {
			_compraRepository.save(t);
			return true;
		} catch (final Exception e) {
			return false;
		}
	}

	public Compra insert(final Compra t, final int idReciclador, final int idMaterial) {
		final Usuario reciclador = _usuarioRepository.findById(idReciclador).get();
		final MateriaReciclado materialReciclado = _materialrecicladoRepository.findById(idMaterial).get();
		t.setReciclador(reciclador);
		t.setMaterialReciclado(materialReciclado);
		_compraRepository.save(t);
		return t;
	}

	@Override
	public void update(final Compra t) {
		_compraRepository.save(t);
	}

	@Override
	public void delete(final int id) {
		_compraRepository.deleteById(id);
	}

	@Override
	public List<Compra> listAll() {
		return _compraRepository.findAll();
	}

	@Override
	public Optional<Compra> finbyId(final int id) {
		return _compraRepository.findById(id);
	}

	@Override
	public List<Compra> listarCompraUsuario(int id) {
		return _compraRepository.listarCompraUsuarioDAO(id);
	}


	
	
}
