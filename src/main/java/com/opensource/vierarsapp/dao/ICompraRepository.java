package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;


import com.opensource.vierarsapp.models.Compra;
import java.util.List;


@Repository
public interface ICompraRepository extends JpaRepository<Compra, Integer>{

    @Query("select a from Compra a where a.usuario.idUsuario = :id_user")
    List<Compra> listarCompraUsuarioDAO(@Param("id_user") int id_user);

}
