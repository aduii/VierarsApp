package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Tipo;

@Repository
public interface ITipoRepository extends JpaRepository<Tipo, Integer>{

}
