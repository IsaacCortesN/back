package com.muebleria.service.impl;

import java.util.List;

import com.muebleria.model.Roles;
import com.muebleria.model.DTO.RolesDTO;
import com.muebleria.repository.RolesRepository;
import com.muebleria.service.RolesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements RolesService{

    @Autowired
    private RolesRepository rolesRepository;

    @Override
    public List<Roles> buscarRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles agregarRoles(String nombre, String correo, String rol, String contrasena) {
        Roles nuevoRol = new Roles();

        nuevoRol.setNombre(nombre);
        nuevoRol.setCorreo(correo);
        nuevoRol.setRol(rol);
        nuevoRol.setContrasena(contrasena);
        nuevoRol.setBorrado(0);

        nuevoRol = rolesRepository.save(nuevoRol);
        return nuevoRol;
    }

    @Override
    public Roles editarRoles(RolesDTO rol) {
        Roles nuevoRol = rolesRepository.findByIdRol(rol.getIdRol());

        nuevoRol.setRol(rol.getRol());

        nuevoRol = rolesRepository.save(nuevoRol);
        return nuevoRol;
    }

    @Override
    public Roles eliminarRoles(Integer idRoles) {
        Roles nuevoRol = rolesRepository.findByIdRol(idRoles);

        nuevoRol.setBorrado(1);
        
        nuevoRol = rolesRepository.save(nuevoRol);
        return nuevoRol;
    }
    
}
