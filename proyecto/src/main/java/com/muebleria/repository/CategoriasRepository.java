package com.muebleria.repository;

import java.util.List;

import com.muebleria.model.Categorias;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriasRepository extends CrudRepository<Categorias,Integer> {
    
    @Query(value = "SELECT * FROM categorias WHERE borrado = 0", nativeQuery = true)
    List<Categorias>  findAll();
    
    @Query(value = "SELECT * FROM categorias WHERE IdCategoria  = ?1 AND borrado = 0", nativeQuery = true)
    Categorias findByIdCategoria(Integer idUsuario);
}
