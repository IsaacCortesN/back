package com.muebleria.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.muebleria.model.Categorias;
import com.muebleria.model.Citas;
import com.muebleria.model.DetalleCitas;
import com.muebleria.model.Usuarios;
import com.muebleria.model.DTO.CitasDTO;
import com.muebleria.model.DTO.CitasUsuarioDTO;
import com.muebleria.model.DTO.DTO;
import com.muebleria.repository.CategoriasRepository;
import com.muebleria.repository.CitasRepository;
import com.muebleria.repository.DetalleCitasRepository;
import com.muebleria.repository.UsuariosRepository;
import com.muebleria.service.CitasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitasServiceImpl implements CitasService {

    @Autowired
    CitasRepository citasRepository;

    @Autowired
    CategoriasRepository categoriasRepository;

    @Autowired
    DetalleCitasRepository detalleCitasRepository;

    @Autowired
    UsuariosRepository usuariosRepository;


    @Override
    public List<Citas> buscarCitas() {
        return citasRepository.findAll();
    }

    @Override
    public Citas agregarCitas(CitasDTO cita) {
        Citas nuevoCita = new Citas();
        DetalleCitas nuevoDetalleCitas = new DetalleCitas();
        Categorias nuevoCategorias = new Categorias();
        
        nuevoCita.setFecha(cita.getFecha());
        nuevoCita.setHora(cita.getHora());
        nuevoCita.setDireccion(cita.getDireccion());

        nuevoCita = citasRepository.save(nuevoCita);
        nuevoCategorias.setTipoCategoria(cita.getTipoCategoria());
        nuevoCategorias.setDescripcionCategoria(cita.getDescripcionCategoria());

        nuevoCategorias = categoriasRepository.save(nuevoCategorias);
        nuevoDetalleCitas.setCategoriasIdCategoria(nuevoCategorias.getIdCategoria());
        nuevoDetalleCitas.setUsuariosIdUsuario(cita.getIdCliente());
        nuevoDetalleCitas.setCitasIdCita(nuevoCita.getIdCita());
        nuevoDetalleCitas = detalleCitasRepository.save(nuevoDetalleCitas);
        return nuevoCita;

    }

    @Override
    public Citas editarCitas(CitasDTO cita) {
        Citas nuevoCita = citasRepository.findByIdRol(cita.getIdCita());

        nuevoCita.setFecha(cita.getFecha());
        nuevoCita.setHora(cita.getHora());
        nuevoCita.setDireccion(cita.getDireccion());

        nuevoCita = citasRepository.save(nuevoCita);
        return nuevoCita;
    }

    @Override
    public Citas editarCitasUsuario(CitasUsuarioDTO cita) {
        Citas nuevoCita = citasRepository.findByIdRol(cita.getIdCita());
        DetalleCitas detalle = detalleCitasRepository.findByIdRol(cita.getIdDetalle());
        detalle.setCategoriasIdCategoria(cita.getTipoCategoria());

        nuevoCita.setFecha(cita.getFecha());
        nuevoCita.setHora(cita.getHora());
        nuevoCita.setDireccion(cita.getDireccion());

        nuevoCita = citasRepository.save(nuevoCita);
        return nuevoCita;
    }

    @Override
    public Citas eliminarCitas(Integer cita) {
        Citas nuevoCita = citasRepository.findByIdRol(cita);
        DetalleCitas nuevoDetalleCitas = detalleCitasRepository.findByIdCitas(cita);

        nuevoCita.setBorrado(1);
        nuevoDetalleCitas.setBorrado(1);
        nuevoDetalleCitas = detalleCitasRepository.save(nuevoDetalleCitas);
        nuevoCita = citasRepository.save(nuevoCita);

        return nuevoCita;
    }

    @Override
    public List<DTO>  relacion() {
        List<DetalleCitas> detalle = detalleCitasRepository.findAll();
        List<DTO> relacionLista = new ArrayList<>();
        Integer contador = 0;
                for(DetalleCitas x:detalle){
                    System.out.println("----------------------------------");
                    System.out.println(x.getCitasIdCita());
                    System.out.println(x.getCategoriasIdCategoria());
                    System.out.println(x.getUsuariosIdUsuario());
                    Citas nuevoCita = citasRepository.findByIdRol(x.getCitasIdCita());
            Categorias categoria = categoriasRepository.findByIdCategoria(x.getCategoriasIdCategoria()); 
            Usuarios usuario = usuariosRepository.findByIdUsuario(x.getUsuariosIdUsuario());
            DTO dto = new DTO(usuario, nuevoCita, categoria, x.getIdDetalle());   
            relacionLista.add(contador, dto);
            contador = contador + 1;
        }

        return relacionLista;
    }

    @Override
    public List<Citas> getCitasById(Integer idCliente) {
        List<Citas> getCita = new ArrayList<>();
        List<DetalleCitas> detalle = detalleCitasRepository.findByIdUsuario(idCliente);
        for(DetalleCitas x:detalle){
            Citas citas = citasRepository.findByIdRol(x.getCitasIdCita());
            getCita.add(citas);
        }
        return getCita;
    }
    
    
}
