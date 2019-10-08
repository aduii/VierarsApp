package com.opensource.vierarsapp.services;

import java.util.List;
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
	public boolean insert(Pais t) {
		return _paisRepository.insert(t);
	}

	@Override
	public boolean update(Pais t) {
		return _paisRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _paisRepository.delete(id);
	}

	@Override
	public List<Pais> listAll() {
		return _paisRepository.listAll();
	}

	@Override
	public Pais finbyId(int id) {
		return _paisRepository.finbyId(id);
	}
	
}
