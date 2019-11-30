package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.ICiudadRepository;
import com.opensource.vierarsapp.models.Ciudad;

@Service("ciudadService")
@ComponentScan(value = "com.opensource.vierarsapp")
public class CiudadService implements ICiudadService {

	@Autowired
	private ICiudadRepository _ciudadRepository;
	
	@Override
	public boolean insert(Ciudad t) {
		try {
			_ciudadRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void update(Ciudad t) {
		_ciudadRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_ciudadRepository.deleteById(id);
	}

	@Override
	public List<Ciudad> listAll() {
		return _ciudadRepository.findAll();
	}

	@Override
	public Optional<Ciudad> finbyId(int id) {
		return _ciudadRepository.findById(id);
	}

}
