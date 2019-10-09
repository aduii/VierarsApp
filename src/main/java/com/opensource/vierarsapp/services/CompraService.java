package com.opensource.vierarsapp.services;

import java.util.List;

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
		return _compraRepository.insert(t);
	}

	@Override
	public boolean update(Compra t) {
		return _compraRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _compraRepository.delete(id);
	}

	@Override
	public List<Compra> listAll() {
		return _compraRepository.listAll();
	}

	@Override
	public Compra finbyId(int id) {
		return _compraRepository.finbyId(id);
	}
	
	
}
