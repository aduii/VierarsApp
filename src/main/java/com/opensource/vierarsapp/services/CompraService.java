package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.ICompraRepository;
import com.opensource.vierarsapp.models.Compra;

@Service("compraService")
@Transactional
public class CompraService implements ICompraService{

	@Autowired
	private ICompraRepository _compraRepository;

	@Override
	public boolean insert(Compra t) {
		try {
			_compraRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void update(Compra t) {
		_compraRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_compraRepository.deleteById(id);
	}

	@Override
	public List<Compra> listAll() {
		return _compraRepository.findAll();
	}

	@Override
	public Optional<Compra> finbyId(int id) {
		return _compraRepository.findById(id);
	}


	
	
}
