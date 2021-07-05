package com.muebleria.service;

import java.util.List;
import com.muebleria.model.*;
import com.muebleria.model.DTO.DetalleCitaDTO;

public interface DetalleCitasService {

    List<DetalleCitas> buscarDetalles();
    DetalleCitas agregarDetalle(DetalleCitaDTO Detalle);
    DetalleCitas editarDetalle(DetalleCitaDTO Detalle);
    DetalleCitas eliminarDetalle(Integer Detalle);
}
