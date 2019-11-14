package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Detalle_Compra;

@Repository
public interface IDetalleCompraRepository extends JpaRepository<Detalle_Compra, Integer>{

}
