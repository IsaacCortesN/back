package com.muebleria.service.impl;


import java.util.List;

import com.muebleria.model.Usuarios;
import com.muebleria.model.DTO.UsuariosDTO;
import com.muebleria.repository.UsuariosRepository;
import com.muebleria.service.UsuariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosServiceImpl implements UsuariosService{

    @Autowired
    private UsuariosRepository usuariosRepository;

    @Override
    public List<Usuarios> buscarUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    public Usuarios agregarUsuario(UsuariosDTO usuario) {
        Usuarios nuevoUsuario = new Usuarios();

        nuevoUsuario.setNombre(usuario.getNombre());
        nuevoUsuario.setApellidos(usuario.getApellidos());
        nuevoUsuario.setCorreo(usuario.getCorreo());
        nuevoUsuario.setContrasena(usuario.getContrasena());
        nuevoUsuario.setFoto(usuario.getFoto());
        nuevoUsuario.setTelefono(usuario.getTelefono());
        nuevoUsuario.setRolesIdRol(usuario.getIdRol());

        nuevoUsuario = usuariosRepository.save(nuevoUsuario);

        return nuevoUsuario;
    }

    @Override
    public Usuarios editarUsuario(UsuariosDTO usuario) {
        Usuarios usuarioEdit = usuariosRepository.findByIdUsuario(usuario.getIdUsuario());

        usuarioEdit.setNombre(usuario.getNombre());
        usuarioEdit.setApellidos(usuario.getApellidos());
        usuarioEdit.setCorreo(usuario.getCorreo());
        usuarioEdit.setContrasena(usuario.getContrasena());
        usuarioEdit.setFoto(usuario.getFoto());
        usuarioEdit.setTelefono(usuario.getTelefono());
        usuarioEdit.setRolesIdRol(usuario.getIdRol());

        usuarioEdit = usuariosRepository.save(usuarioEdit);
        return usuarioEdit;
    }

    @Override
    public Usuarios eliminarUsuarios(Integer idUsuario) {
        Usuarios usuarioDelete = usuariosRepository.findByIdUsuario(idUsuario);

        usuarioDelete.setBorrado(1);

        usuarioDelete = usuariosRepository.save(usuarioDelete);
        return usuarioDelete;
    }

    @Override
    public Usuarios login(UsuariosDTO usuario) {
        Usuarios login  = usuariosRepository.login(usuario.getCorreo(), usuario.getContrasena());
        return login;
    }

    @Override
    public Usuarios perfil(Integer idUsuario, String nombre, String correo, String contrasena, String telefono) {
        Usuarios perfil = usuariosRepository.findByIdUsuario(idUsuario);
        perfil.setNombre(nombre);
        perfil.setCorreo(correo);
        perfil.setContrasena(contrasena);
        perfil.setTelefono(telefono);
        perfil = usuariosRepository.save(perfil);
        return perfil;
    }
    
}
