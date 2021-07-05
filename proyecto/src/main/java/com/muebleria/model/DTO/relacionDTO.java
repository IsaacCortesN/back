package com.muebleria.model.DTO;


public class relacionDTO {
    private Integer idDetalle;    
    private Integer IdUsuario;
    private String Nombre;
    private String Apellidos;
    private String Fecha;
    private String Hora;
    private String Direccion;
    private String TipoCategoria;
    private String DescripcionCategoria;

    
    public relacionDTO() {
    }


    public Integer getIdDetalle() {
        return idDetalle;
    }


    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }


    public Integer getIdUsuario() {
        return IdUsuario;
    }


    public void setIdUsuario(Integer idUsuario) {
        IdUsuario = idUsuario;
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


    public String getFecha() {
        return Fecha;
    }


    public void setFecha(String fecha) {
        Fecha = fecha;
    }


    public String getHora() {
        return Hora;
    }


    public void setHora(String hora) {
        Hora = hora;
    }


    public String getDireccion() {
        return Direccion;
    }


    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    public String getTipoCategoria() {
        return TipoCategoria;
    }


    public void setTipoCategoria(String tipoCategoria) {
        TipoCategoria = tipoCategoria;
    }


    public String getDescripcionCategoria() {
        return DescripcionCategoria;
    }


    public void setDescripcionCategoria(String descripcionCategoria) {
        DescripcionCategoria = descripcionCategoria;
    }

        
    
        
    
}
