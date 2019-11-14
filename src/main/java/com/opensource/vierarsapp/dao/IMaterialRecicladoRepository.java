package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.MateriaReciclado;

@Repository
public interface IMaterialRecicladoRepository extends JpaRepository<MateriaReciclado, Integer>{

}
