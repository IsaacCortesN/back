package com.muebleria.service.impl;

import java.util.List;

import com.muebleria.model.Categorias;
import com.muebleria.model.DTO.CategoriasDTO;
import com.muebleria.repository.CategoriasRepository;
import com.muebleria.service.CategoriasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriasServiceImpl implements CategoriasService{

    @Autowired
    CategoriasRepository categoriasRepository;

    @Override
    public List<Categorias> buscarCategorias() {
        return categoriasRepository.findAll();
    }

    @Override
    public Categorias agregarCategorias(String categorias, String tipocategorias) {
        Categorias nuevaCategoria = new Categorias();

        nuevaCategoria.setTipoCategoria(categorias);

        nuevaCategoria.setDescripcionCategoria(tipocategorias);

        nuevaCategoria = categoriasRepository.save(nuevaCategoria);

        return nuevaCategoria;
    }

    @Override
    public Categorias editarCategorias(CategoriasDTO Categorias) {
        Categorias nuevaCategoria = categoriasRepository.findByIdCategoria(Categorias.getIdCategoria());

        nuevaCategoria.setTipoCategoria(Categorias.getTipoCategoria());
        nuevaCategoria.setDescripcionCategoria(Categorias.getDescripcionCategoria());

        nuevaCategoria = categoriasRepository.save(nuevaCategoria);
        
        return nuevaCategoria;
    }

    @Override
    public Categorias eliminarCategorias(Integer Categorias) {
        Categorias nuevaCategoria = categoriasRepository.findByIdCategoria(Categorias);

        nuevaCategoria.setBorrado(1);

        nuevaCategoria = categoriasRepository.save(nuevaCategoria);
        
        return nuevaCategoria;
    }

}