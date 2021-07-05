package com.muebleria.repository;

import java.util.List;

import com.muebleria.model.Citas;
import com.muebleria.model.DTO.relacionDTO;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CitasRepository extends CrudRepository<Citas,Integer> {
    
    @Query(value = "SELECT * FROM citas WHERE borrado = 0", nativeQuery = true)
    List<Citas>  findAll();
    
    @Query(value = "SELECT * FROM citas WHERE IdCita  = ?1 AND borrado = 0", nativeQuery = true)
    Citas findByIdRol(Integer idUsuario);

    //@Query("SELECT new com.muebleria.model.DTO.relacionDTO(dc.idDetalle, u.Nombre, u.Apellidos, c.Fecha, c.Hora, c.Direccion) FROM DetalleCitas dc JOIN Usuarios u ON dc.usuariosIdUsuario = u.idUsuario JOIN citas c ON dc.citasIdCita = c.idCita")
    @Query(value = "SELECT * FROM detalle_citas dc JOIN usuarios u ON dc.Usuarios_IdUsuario = u.IdUsuario JOIN citas c ON dc.Citas_IdCita = c.IdCita", nativeQuery = true)
    List<relacionDTO> findRelacion(); 

}
