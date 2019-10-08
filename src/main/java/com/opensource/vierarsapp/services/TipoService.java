package com.opensource.vierarsapp.services;

import java.util.List;

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
	public boolean insert(Tipo t) {
		return _tipoRepository.insert(t);
	}

	@Override
	public boolean update(Tipo t) {
		return _tipoRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _tipoRepository.delete(id);
	}

	@Override
	public List<Tipo> listAll() {
		return _tipoRepository.listAll();
	}

	@Override
	public Tipo finbyId(int id) {
		return _tipoRepository.finbyId(id);
	}

	
	
}
