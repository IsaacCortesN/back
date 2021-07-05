package com.muebleria.api;


import java.util.List;

import com.muebleria.model.Usuarios;
import com.muebleria.model.DTO.UsuariosDTO;
import com.muebleria.service.UsuariosService;

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
@RequestMapping("/api/usuarios")
public class usuariosApi {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping("/addUsuario")
    public Usuarios addUsuario(@RequestBody UsuariosDTO usuario){
        return usuariosService.agregarUsuario(usuario);
    }

    @GetMapping("/getUsuarios")
    public List<Usuarios> getUsuarios(){
        return usuariosService.buscarUsuarios();
    }

    @PostMapping("/editUsuario")
    public Usuarios editUsuario(@RequestBody UsuariosDTO usuario){
        return usuariosService.editarUsuario(usuario);
    }

    @PostMapping("/deleteUsuario/{idUsuario}")
    public Usuarios deleteUsuario(@PathVariable("idUsuario") Integer idUsuario){
        return usuariosService.eliminarUsuarios(idUsuario);
    }

    @PostMapping("/login")
    public Usuarios login(@RequestBody UsuariosDTO usuario){
        return usuariosService.login(usuario);
    }

    @PostMapping("/editPerfil/{idUsuario}/{nombre}/{correo}/{contrasena}/{telefono}")
    public Usuarios editPerfil(@PathVariable("idUsuario")Integer idUsuario, @PathVariable ("nombre") String nombre, @PathVariable("correo")String correo, @PathVariable("contrasena")String contrasena, @PathVariable("telefono")String telefono){
        return usuariosService.perfil(idUsuario, nombre, correo, contrasena, telefono);
    }
    
}
