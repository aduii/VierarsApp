package com.opensource.vierarsapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.IDetalleCompraRepository;
import com.opensource.vierarsapp.models.DetalleCompra;

@Service("detallecompraService")
@Transactional
public class DetalleCompraService implements IDetalleCompraService {

	@Autowired
	private IDetalleCompraRepository _detallecompraRepository;

	@Override
	public boolean insert(DetalleCompra t) {
		return _detallecompraRepository.insert(t);	
	}

	@Override
	public boolean update(DetalleCompra t) {
		return _detallecompraRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _detallecompraRepository.delete(id);
	}

	@Override
	public List<DetalleCompra> listAll() {
		return _detallecompraRepository.listAll();
	}

	@Override
	public DetalleCompra finbyId(int id) {
		return _detallecompraRepository.finbyId(id);
	}
}
