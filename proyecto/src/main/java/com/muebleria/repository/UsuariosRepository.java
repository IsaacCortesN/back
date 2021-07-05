package com.muebleria.repository;

import java.util.List;

import com.muebleria.model.Usuarios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UsuariosRepository extends CrudRepository<Usuarios,Integer>{

    @Query(value = "SELECT * FROM usuarios WHERE borrado = 0", nativeQuery = true)
    List<Usuarios> findAll();

    @Query(value = "SELECT * FROM usuarios WHERE idUsuario = ?1 AND borrado = 0", nativeQuery = true)
    Usuarios findByIdUsuario(Integer idUsuario);

    @Query(value = "SELECT * FROM usuarios WHERE borrado = 0 AND correo = ?1 AND contrasena = ?2", nativeQuery = true)
    Usuarios login(String correo , String contrasena);
}
