package com.muebleria.model.DTO;

public class UsuariosDTO {
    public Integer idUsuario;
    public String Nombre;
    public String Apellidos;
    public String Correo;
    public String Telefono;
    public String Foto;
    public String Contrasena;
    public Integer idRol;
    
    public UsuariosDTO() {
    }

    public UsuariosDTO(Integer idUsuario, String nombre, String apellidos, String correo, String telefono, String foto,
            String contrasena, Integer idRol) {
        this.idUsuario = idUsuario;
        Nombre = nombre;
        Apellidos = apellidos;
        Correo = correo;
        Telefono = telefono;
        Foto = foto;
        Contrasena = contrasena;
        this.idRol = idRol;
    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }
    

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String contrasena) {
        Contrasena = contrasena;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        Foto = foto;
    }

    
}
