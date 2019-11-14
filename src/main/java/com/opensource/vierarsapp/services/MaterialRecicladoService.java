package com.opensource.vierarsapp.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.opensource.vierarsapp.dao.IMaterialRecicladoRepository;
import com.opensource.vierarsapp.models.MateriaReciclado;

@Service("materialrecicladoService")
@Transactional
public class MaterialRecicladoService implements IMaterialRecicladoService{

	@Autowired
	private IMaterialRecicladoRepository _materialrecicladoRepository;

	@Override
	public void insert(MateriaReciclado t) {
		_materialrecicladoRepository.save(t);
	}

	@Override
	public void update(MateriaReciclado t) {
		_materialrecicladoRepository.save(t);
	}

	@Override
	public void delete(int id) {
		_materialrecicladoRepository.deleteById(id);
	}

	@Override
	public List<MateriaReciclado> listAll() {
		return _materialrecicladoRepository.findAll();
	}

	@Override
	public Optional<MateriaReciclado> finbyId(int id) {
		return _materialrecicladoRepository.findById(id);
	}

}
