package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Pais;

@Repository
public interface IPaisRepository extends JpaRepository<Pais, Integer> {

}
