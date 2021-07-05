package com.muebleria.service.impl;

import java.util.List;

import com.muebleria.model.DetalleCitas;
import com.muebleria.model.DTO.DetalleCitaDTO;
import com.muebleria.repository.DetalleCitasRepository;
import com.muebleria.service.DetalleCitasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCitasServiceImpl implements DetalleCitasService{

    @Autowired
    DetalleCitasRepository detalleCitasRepository;
    @Override
    public List<DetalleCitas> buscarDetalles() {
        return detalleCitasRepository.findAll();
    }

    @Override
    public DetalleCitas agregarDetalle(DetalleCitaDTO Detalle) {
        DetalleCitas nuevoDetalle = new DetalleCitas();

        nuevoDetalle.setUsuariosIdUsuario(Detalle.getUsuarios_IdUsuario());
        nuevoDetalle.setCitasIdCita(Detalle.getCitas_IdCita());
        nuevoDetalle.setCategoriasIdCategoria(Detalle.getCategorias_IdCategoria());

        nuevoDetalle = detalleCitasRepository.save(nuevoDetalle);

        return nuevoDetalle;
    }

    @Override
    public DetalleCitas editarDetalle(DetalleCitaDTO Detalle) {
        DetalleCitas nuevoDetalle = detalleCitasRepository.findByIdRol(Detalle.getIdDetalle());

        nuevoDetalle.setUsuariosIdUsuario(Detalle.getUsuarios_IdUsuario());
        nuevoDetalle.setCitasIdCita(Detalle.getCitas_IdCita());
        nuevoDetalle.setCategoriasIdCategoria(Detalle.getCategorias_IdCategoria());

        nuevoDetalle = detalleCitasRepository.save(nuevoDetalle);
        
        return nuevoDetalle;
    }

    @Override
    public DetalleCitas eliminarDetalle(Integer Detalle) {
        DetalleCitas nuevoDetalle = detalleCitasRepository.findByIdRol(Detalle);
        nuevoDetalle.setBorrado(1);
        nuevoDetalle = detalleCitasRepository.save(nuevoDetalle);
        
        return nuevoDetalle;
    }
    
}
