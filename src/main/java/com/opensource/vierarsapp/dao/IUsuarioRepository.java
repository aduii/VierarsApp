package com.opensource.vierarsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.opensource.vierarsapp.models.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

    @Query("select a from Usuario a where a.email = :pass_email and a.password = :pass_password")
    Usuario buscarPorEmail(@Param("pass_email") String pass_email, @Param("pass_password") String pass_password);

}
