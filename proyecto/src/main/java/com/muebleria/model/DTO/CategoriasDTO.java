package com.muebleria.model.DTO;

public class CategoriasDTO {
    private Integer idCategoria;
    private String TipoCategoria;
    private String DescripcionCategoria;

    public CategoriasDTO() {
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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
