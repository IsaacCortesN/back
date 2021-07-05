package com.muebleria.model.DTO;

public class CitasUsuarioDTO {

    private Integer IdCita;
    private String Fecha;
    private String	Hora;
    private String	Direccion;
    private Integer idCliente;
    private Integer tipoCategoria;
    private Integer idDetalle;


    public CitasUsuarioDTO() {
    }

    public Integer getIdCita() {
        return IdCita;
    }
    public void setIdCita(Integer idCita) {
        IdCita = idCita;
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
    public Integer getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public Integer getTipoCategoria() {
        return tipoCategoria;
    }
    public void setTipoCategoria(Integer tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }
    
    
    
}
