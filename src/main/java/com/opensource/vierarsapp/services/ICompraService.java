package com.opensource.vierarsapp.services;

import java.util.List;
import com.opensource.vierarsapp.models.Compra;

public interface ICompraService extends ICrudService<Compra>{

    public List<Compra> listarCompraUsuario(int id);

}
