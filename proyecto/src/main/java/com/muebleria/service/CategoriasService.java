package com.muebleria.service;

import com.muebleria.model.DTO.CategoriasDTO;
import java.util.List;
import com.muebleria.model.*;

public interface CategoriasService {
    List<Categorias> buscarCategorias();
    Categorias agregarCategorias(String categorias, String tipocategorias);
    Categorias editarCategorias(CategoriasDTO Categorias);
    Categorias eliminarCategorias(Integer Categorias);
    
}
