package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Compra;

@Repository
public interface ICompraRepository extends JpaRepository<Compra, Integer>{

}
