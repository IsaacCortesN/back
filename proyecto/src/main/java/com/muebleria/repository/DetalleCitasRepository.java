package com.muebleria.repository;

import java.util.List;

import com.muebleria.model.DetalleCitas;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DetalleCitasRepository extends CrudRepository<DetalleCitas,Integer>{

    @Query(value = "SELECT * FROM detalle_citas WHERE borrado = 0", nativeQuery = true)
    List<DetalleCitas>  findAll();
    
    @Query(value = "SELECT * FROM detalle_citas WHERE idDetalle  = ?1 AND borrado = 0", nativeQuery = true)
    DetalleCitas findByIdRol(Integer idDetalle);

    @Query(value = "SELECT * FROM detalle_citas WHERE Usuarios_IdUsuario  = ?1 AND borrado = 0", nativeQuery = true)
    List<DetalleCitas> findByIdUsuario(Integer idUsuario);

    @Query(value = "SELECT * FROM detalle_citas WHERE Citas_IdCita  = ?1 AND borrado = 0", nativeQuery = true)
    DetalleCitas findByIdCitas(Integer idCita);

}
