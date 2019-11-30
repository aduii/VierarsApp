package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

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
		try {
			_detallecompraRepository.save(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public void update(Detalle_Compra t) {
		_detallecompraRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_detallecompraRepository.deleteById(id);
	}

	@Override
	public List<Detalle_Compra> listAll() {
		return _detallecompraRepository.findAll();
	}

	@Override
	public Optional<Detalle_Compra> finbyId(int id) {
		return _detallecompraRepository.findById(id);
	}

}
