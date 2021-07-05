package com.muebleria.api;

import java.util.List;

import com.muebleria.model.DetalleCitas;
import com.muebleria.model.DTO.DetalleCitaDTO;
import com.muebleria.service.DetalleCitasService;

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
@RequestMapping("/api/detalleCita")
public class detalleApi {

    @Autowired
    DetalleCitasService detalleCitasService;

    @PostMapping("/addDetalle")
    public DetalleCitas addUsuario(@RequestBody DetalleCitaDTO detalle){
        return detalleCitasService.agregarDetalle(detalle);
    }

    @GetMapping("/getDetalle")
    public List<DetalleCitas> getUsuarios(){
        return detalleCitasService.buscarDetalles();
    }

    @PostMapping("/editDetalle")
    public DetalleCitas editUsuario(@RequestBody DetalleCitaDTO detalle){
        return detalleCitasService.editarDetalle(detalle);
    }

    @PostMapping("/deleteDetalle/{idDetalle}")
    public DetalleCitas deleteUsuario(@PathVariable("idDetalle") Integer idDetalle){
        return detalleCitasService.eliminarDetalle(idDetalle);
    }
    
}
