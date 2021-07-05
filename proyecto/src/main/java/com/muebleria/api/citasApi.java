package com.muebleria.api;

import java.util.List;

import com.muebleria.model.Citas;
import com.muebleria.model.DTO.CitasDTO;
import com.muebleria.model.DTO.CitasUsuarioDTO;
import com.muebleria.model.DTO.DTO;
import com.muebleria.service.CitasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST})
@RequestMapping("/api/cita")
public class citasApi {

    @Autowired
    CitasService citasService;

    @PostMapping("/addCita")
    public Citas addUsuario(@RequestBody CitasDTO citas){
        return citasService.agregarCitas(citas);
    }

    @GetMapping("/getCitas")
    public List<Citas> getUsuarios(){
        return citasService.buscarCitas();
    }

    @PostMapping("/editCitas")
    public Citas editUsuario(@RequestBody CitasDTO detalle){
        return citasService.editarCitas(detalle);
    }

    @PostMapping("/editCitasUsuario")
    public Citas editUsuarioCitas(@RequestBody CitasUsuarioDTO detalle){
        return citasService.editarCitasUsuario(detalle);
    }

    @PostMapping("/deleteCitas/{idCita}")
    public Citas deleteUsuario(@PathVariable("idCita") Integer idCita){
        return citasService.eliminarCitas(idCita);
    }
    @GetMapping("/getRelaciones")
    public List<DTO> getRelaciones(){
        return citasService.relacion();
    }

    @GetMapping("/getCitasById/{idCliente}")
    public List<Citas> getCitasById(@PathVariable("idCliente") Integer idCliente){
        return citasService.getCitasById(idCliente);
    }
    
}
