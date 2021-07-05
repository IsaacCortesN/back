package com.muebleria.model.DTO;

public class DetalleCitaDTO {
    private Integer idDetalle;
    private Integer Usuarios_IdUsuario;	
    private Integer Citas_IdCita;
    private Integer	Categorias_IdCategoria;
    private Integer	borrado;
    
    public DetalleCitaDTO() {
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public Integer getUsuarios_IdUsuario() {
        return Usuarios_IdUsuario;
    }

    public void setUsuarios_IdUsuario(Integer usuarios_IdUsuario) {
        Usuarios_IdUsuario = usuarios_IdUsuario;
    }

    public Integer getCitas_IdCita() {
        return Citas_IdCita;
    }

    public void setCitas_IdCita(Integer citas_IdCita) {
        Citas_IdCita = citas_IdCita;
    }

    public Integer getCategorias_IdCategoria() {
        return Categorias_IdCategoria;
    }

    public void setCategorias_IdCategoria(Integer categorias_IdCategoria) {
        Categorias_IdCategoria = categorias_IdCategoria;
    }

    public Integer getBorrado() {
        return borrado;
    }

    public void setBorrado(Integer borrado) {
        this.borrado = borrado;
    }

    
}
