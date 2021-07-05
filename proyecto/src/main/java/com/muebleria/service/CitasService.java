package com.muebleria.service;

import com.muebleria.model.DTO.CitasDTO;
import com.muebleria.model.DTO.CitasUsuarioDTO;
import com.muebleria.model.DTO.DTO;


import java.util.List;
import com.muebleria.model.*;

public interface CitasService {
    
    List<Citas> buscarCitas();
    Citas agregarCitas(CitasDTO Detalle);
    Citas editarCitas(CitasDTO Detalle);
    Citas eliminarCitas(Integer Detalle);
    List<DTO> relacion();
    List<Citas> getCitasById(Integer idCliente);
    Citas editarCitasUsuario(CitasUsuarioDTO cita);
}
