package com.muebleria.model.DTO;

public class CitasDTO {

    private Integer IdCita;
    private String Fecha;
    private String	Hora;
    private String	Direccion;
    private Integer idCliente;
    private String tipoCategoria;
    private String descripcionCategoria; 
    
    public CitasDTO() {
    }

    
    public CitasDTO(Integer idCita, String fecha, String hora, String direccion, Integer idCliente,
            String tipoCategoria, String descripcionCategoria) {
        IdCita = idCita;
        Fecha = fecha;
        Hora = hora;
        Direccion = direccion;
        this.idCliente = idCliente;
        this.tipoCategoria = tipoCategoria;
        this.descripcionCategoria = descripcionCategoria;
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

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getDescripcionCategoria() {
        return descripcionCategoria;
    }

    public void setDescripcionCategoria(String descripcionCategoria) {
        this.descripcionCategoria = descripcionCategoria;
    }

        
}
