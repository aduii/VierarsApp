package com.opensource.vierarsapp.services;

import java.util.List;

import com.opensource.vierarsapp.models.MateriaReciclado;

public interface IMaterialRecicladoService extends ICrudService<MateriaReciclado>{

    public List<MateriaReciclado> listarMaterialSinVender();

    public List<MateriaReciclado> listarMaterialUsuario(int id);

}
