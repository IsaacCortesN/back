package com.muebleria.service;

import java.util.List;

import com.muebleria.model.*;
import com.muebleria.model.DTO.UsuariosDTO;

public interface UsuariosService {
    List<Usuarios> buscarUsuarios();
    Usuarios agregarUsuario(UsuariosDTO usuario);
    Usuarios editarUsuario(UsuariosDTO usuario);
    Usuarios eliminarUsuarios(Integer idUsuario);
    Usuarios login(UsuariosDTO usuario);
    Usuarios perfil(Integer idUsuario, String nombre, String correo, String contrasena, String telefono);
}
