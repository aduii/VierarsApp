package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

import com.opensource.vierarsapp.models.MateriaReciclado;

@Repository
public interface IMaterialRecicladoRepository extends JpaRepository<MateriaReciclado, Integer>{

    @Query("select a from MateriaReciclado a where a.esta_vendido = 0")
    List<MateriaReciclado> listarMaterialSinVender();

    @Query("select a from MateriaReciclado a where a.usuario.idUsuario = :id_user")
    List<MateriaReciclado> listarMaterialUsuarioDAO(@Param("id_user") int id_user);

}
