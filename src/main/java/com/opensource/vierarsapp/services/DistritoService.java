package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.IDistritoRepository;
import com.opensource.vierarsapp.models.Distrito;

@Service("distritoService")
@Transactional
public class DistritoService implements IDistritoService {

	@Autowired
	private
	IDistritoRepository _distritoRepository;
	
	@Override
	public void insert(Distrito t) {
		_distritoRepository.save(t);
	}

	@Override
	public void update(Distrito t) {
		_distritoRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_distritoRepository.deleteById(id);
	}

	@Override
	public List<Distrito> listAll() {
		return _distritoRepository.findAll();
	}

	@Override
	public Optional<Distrito> finbyId(int id) {
		return _distritoRepository.findById(id);
	}


}
