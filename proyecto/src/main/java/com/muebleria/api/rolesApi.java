package com.muebleria.api;

import java.util.List;

import com.muebleria.model.Roles;
import com.muebleria.model.DTO.RolesDTO;
import com.muebleria.service.RolesService;

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
@RequestMapping("/api/roles")
public class rolesApi {

    @Autowired
    RolesService rolesService;

    @PostMapping("/addRoles/{nombre}/{correo}/{rol}/{contrasena}")
    public Roles addUsuario(@PathVariable ("nombre")String nombre, @PathVariable("correo")String correo, @PathVariable("rol")String rol, @PathVariable("contrasena")String contrasena){
        return rolesService.agregarRoles(nombre, correo, rol, contrasena);
    }

    @GetMapping("/getRoles")
    public List<Roles> getUsuarios(){
        return rolesService.buscarRoles();
    }

    @PostMapping("/editRoles")
    public Roles editUsuario(@RequestBody RolesDTO usuario){
        return rolesService.editarRoles(usuario);
    }

    @PostMapping("/deleteRoles/{idRoles}")
    public Roles deleteUsuario(@PathVariable("idRoles") Integer idUsuario){
        return rolesService.eliminarRoles(idUsuario);
    }
}
