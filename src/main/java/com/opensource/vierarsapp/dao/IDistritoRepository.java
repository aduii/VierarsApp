package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Distrito;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito, Integer>{

}
