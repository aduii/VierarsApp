package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.ITipoRepository;
import com.opensource.vierarsapp.models.Tipo;

@Service("tipoService")
@Transactional
public class TipoService implements ITipoService{

	@Autowired
	private ITipoRepository _tipoRepository;

	@Override
	public void insert(Tipo t) {
		_tipoRepository.save(t);
	}

	@Override
	public void update(Tipo t) {
		_tipoRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_tipoRepository.deleteById(id);
	}

	@Override
	public List<Tipo> listAll() {
		return _tipoRepository.findAll();
	}

	@Override
	public Optional<Tipo> finbyId(int id) {
		return _tipoRepository.findById(id);
	}

}
