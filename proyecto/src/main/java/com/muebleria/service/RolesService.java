package com.muebleria.service;

import java.util.List;

import com.muebleria.model.*;
import com.muebleria.model.DTO.RolesDTO;

public interface RolesService {

    List<Roles> buscarRoles();
    Roles agregarRoles(String nombre, String correo, String rol, String contrasena);
    Roles editarRoles(RolesDTO rol);
    Roles eliminarRoles(Integer rol);
}
