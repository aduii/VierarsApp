package com.opensource.vierarsapp.services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.opensource.vierarsapp.dao.IMaterialRecicladoRepository;
import com.opensource.vierarsapp.models.MaterialReciclado;

@Service("materialrecicladoService")
@Transactional
public class MaterialRecicladoService implements IMaterialRecicladoService{

	@Autowired
	private IMaterialRecicladoRepository _materialrecicladoRepository;

	@Override
	public boolean insert(MaterialReciclado t) {
		return _materialrecicladoRepository.insert(t);
	}

	@Override
	public boolean update(MaterialReciclado t) {
		return _materialrecicladoRepository.update(t);
	}

	@Override
	public boolean delete(int id) {
		return _materialrecicladoRepository.delete(id);
	}

	@Override
	public List<MaterialReciclado> listAll() {
		return _materialrecicladoRepository.listAll();
	}

	@Override
	public MaterialReciclado finbyId(int id) {
		return _materialrecicladoRepository.finbyId(id);
	}
}
