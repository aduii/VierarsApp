package com.opensource.vierarsapp.services;

import java.util.List;

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
	public boolean insert(Distrito t) {
		return _distritoRepository.insert(t);
	}

	@Override
	public boolean update(Distrito t) {
		return _distritoRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
	
		return _distritoRepository.delete(id);
	}

	@Override
	public List<Distrito> listAll() {
		return _distritoRepository.listAll();
	}

	@Override
	public Distrito finbyId(int id) {
		return _distritoRepository.finbyId(id);
	}

}
