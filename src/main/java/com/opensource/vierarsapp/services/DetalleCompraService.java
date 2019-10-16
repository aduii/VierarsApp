package com.opensource.vierarsapp.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.vierarsapp.dao.IDetalleCompraRepository;
import com.opensource.vierarsapp.models.Detalle_Compra;

@Service("detallecompraService")
@Transactional
public class DetalleCompraService implements IDetalleCompraService{

	@Autowired
	private IDetalleCompraRepository _detallecompraRepository;

	@Override
	public boolean insert(Detalle_Compra t) {
		return _detallecompraRepository.insert(t);
	}

	@Override
	public boolean update(Detalle_Compra t) {
		return _detallecompraRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _detallecompraRepository.delete(id);
	}

	@Override
	public List<Detalle_Compra> listAll() {
		return _detallecompraRepository.listAll();
	}

	@Override
	public Detalle_Compra finbyId(int id) {
		return _detallecompraRepository.finbyId(id);
	}
}
