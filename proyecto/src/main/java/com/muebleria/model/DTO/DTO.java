package com.muebleria.model.DTO;

import com.muebleria.model.Categorias;
import com.muebleria.model.Citas;
import com.muebleria.model.Usuarios;

public class DTO {
    private Usuarios usuario;
    private Citas citas;
    private Categorias categorias;
    private Integer idDetalle;

    
    public DTO(Usuarios usuario, Citas citas, Categorias categorias, Integer idDetalle) {
        this.usuario = usuario;
        this.citas = citas;
        this.categorias = categorias;
        this.idDetalle = idDetalle;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuario = usuario;
    }

    public Citas getCitas() {
        return citas;
    }

    public void setCitas(Citas citas) {
        this.citas = citas;
    }

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }
    
}
