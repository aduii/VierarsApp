package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.IMaterialRecicladoRepository;
import com.opensource.vierarsapp.dao.ITipoRepository;
import com.opensource.vierarsapp.dao.IUsuarioRepository;
import com.opensource.vierarsapp.models.MateriaReciclado;
import com.opensource.vierarsapp.models.Tipo;
import com.opensource.vierarsapp.models.Usuario;

@Service("materialrecicladoService")
@Transactional
public class MaterialRecicladoService implements IMaterialRecicladoService{

	@Autowired
	private IMaterialRecicladoRepository _materialrecicladoRepository;

	@Autowired
	private IUsuarioRepository _usuarioRepository;

	@Autowired
	private ITipoRepository _tipoRepository;
	@Override
	public boolean insert(final MateriaReciclado t) {
		try {
			_materialrecicladoRepository.save(t);
			return true;
		} catch (final Exception e) {
			return false;
		}
	}

	public MateriaReciclado insert(final MateriaReciclado t, final int idUsuario, final int idTipo) {

		final Usuario usuario = _usuarioRepository.findById(idUsuario).get();
		final Tipo tipo = _tipoRepository.findById(idTipo).get();
		t.setUsuario(usuario);
		t.setTipo(tipo);
		_materialrecicladoRepository.save(t);
		return t;
	}

	@Override
	public void update(final MateriaReciclado t) {
		_materialrecicladoRepository.save(t);
	}

	@Override
	public void delete(final int id) {
		_materialrecicladoRepository.deleteById(id);
	}

	@Override
	public List<MateriaReciclado> listAll() {
		return _materialrecicladoRepository.findAll();
	}

	@Override
	public Optional<MateriaReciclado> finbyId(final int id) {
		return _materialrecicladoRepository.findById(id);
	}

	@Override
	public List<MateriaReciclado> listarMaterialSinVender() {
		return _materialrecicladoRepository.listarMaterialSinVender();
	}

	@Override
	public List<MateriaReciclado> listarMaterialUsuario(int id) {
		return _materialrecicladoRepository.listarMaterialUsuarioDAO(id);
	}

}
