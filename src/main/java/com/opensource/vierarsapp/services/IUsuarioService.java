package com.opensource.vierarsapp.services;

import com.opensource.vierarsapp.models.Usuario;

public interface IUsuarioService  extends ICrudService<Usuario>{

    public Usuario buscarPorEmail(String email, String password);

}
