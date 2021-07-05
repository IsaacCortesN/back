package com.muebleria.model.DTO;

public class RolesDTO {
    private Integer IdRol;
    private String	Nombre;
    private String	Correo;
    private String Rol;
    private String Contrasena;
    
    public RolesDTO() {
    }

    public Integer getIdRol() {
        return IdRol;
    }

    public void setIdRol(Integer idRol) {
        IdRol = idRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    

    
}
