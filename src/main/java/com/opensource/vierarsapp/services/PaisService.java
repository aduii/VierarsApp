package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.opensource.vierarsapp.dao.IPaisRepository;
import com.opensource.vierarsapp.models.Pais;

@Service("paisService")
@Transactional
public class PaisService implements IPaisService{


	@Autowired
	private IPaisRepository _paisRepository;
	
	@Override
	public void insert(Pais t) {
		_paisRepository.save(t);
	}

	@Override
	public void update(Pais t) {
		_paisRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_paisRepository.deleteById(id);
	}

	@Override
	public List<Pais> listAll() {
		return _paisRepository.findAll();
	}

	@Override
	public Optional<Pais> finbyId(int id) {
		return _paisRepository.findById(id);

	}
	
}
