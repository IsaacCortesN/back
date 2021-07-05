package com.muebleria.repository;

import java.util.List;

import com.muebleria.model.Roles;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RolesRepository extends CrudRepository<Roles,Integer> {
    
    @Query(value = "SELECT * FROM roles WHERE borrado = 0", nativeQuery = true)
    List<Roles>  findAll();
    
    @Query(value = "SELECT * FROM roles WHERE IdRol  = ?1 AND borrado = 0", nativeQuery = true)
    Roles findByIdRol(Integer idUsuario);
}
