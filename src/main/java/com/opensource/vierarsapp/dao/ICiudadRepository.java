package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Ciudad;

@Repository
public interface ICiudadRepository extends JpaRepository<Ciudad, Integer> {

}
