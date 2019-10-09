package com.opensource.vierarsapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.ICiudadRepository;
import com.opensource.vierarsapp.models.Ciudad;

@Service("ciudadService")
@Transactional
public class CiudadService implements ICiudadService {

	@Autowired
	private ICiudadRepository _ciudadRepository;
	
	@Override
	public boolean insert(Ciudad t) {
		return _ciudadRepository.insert(t);	
	}

	@Override
	public boolean update(Ciudad t) {
		return _ciudadRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _ciudadRepository.delete(id);
	}

	@Override
	public List<Ciudad> listAll() {
		return _ciudadRepository.listAll();
	}

	@Override
	public Ciudad finbyId(int id) {
		return _ciudadRepository.finbyId(id);
	}
}
