package com.muebleria.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Regalado
 */
@Entity
@Table(name = "detalle_citas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleCitas.findAll", query = "SELECT d FROM DetalleCitas d")
    , @NamedQuery(name = "DetalleCitas.findByIdDetalle", query = "SELECT d FROM DetalleCitas d WHERE d.idDetalle = :idDetalle")
    , @NamedQuery(name = "DetalleCitas.findByUsuariosIdUsuario", query = "SELECT d FROM DetalleCitas d WHERE d.usuariosIdUsuario = :usuariosIdUsuario")
    , @NamedQuery(name = "DetalleCitas.findByCitasIdCita", query = "SELECT d FROM DetalleCitas d WHERE d.citasIdCita = :citasIdCita")
    , @NamedQuery(name = "DetalleCitas.findByCategoriasIdCategoria", query = "SELECT d FROM DetalleCitas d WHERE d.categoriasIdCategoria = :categoriasIdCategoria")
    , @NamedQuery(name = "DetalleCitas.findByBorrado", query = "SELECT d FROM DetalleCitas d WHERE d.borrado = :borrado")})
public class DetalleCitas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDetalle")
    private Integer idDetalle;
    @Basic(optional = false)
    @Column(name = "Usuarios_IdUsuario")
    private int usuariosIdUsuario;
    @Basic(optional = false)
    @Column(name = "Citas_IdCita")
    private int citasIdCita;
    @Basic(optional = false)
    @Column(name = "Categorias_IdCategoria")
    private int categoriasIdCategoria;
    @Basic(optional = false)
    @Column(name = "borrado")
    private int borrado;

    public DetalleCitas() {
    }

    public DetalleCitas(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public DetalleCitas(Integer idDetalle, int usuariosIdUsuario, int citasIdCita, int categoriasIdCategoria, int borrado) {
        this.idDetalle = idDetalle;
        this.usuariosIdUsuario = usuariosIdUsuario;
        this.citasIdCita = citasIdCita;
        this.categoriasIdCategoria = categoriasIdCategoria;
        this.borrado = borrado;
    }

    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getUsuariosIdUsuario() {
        return usuariosIdUsuario;
    }

    public void setUsuariosIdUsuario(int usuariosIdUsuario) {
        this.usuariosIdUsuario = usuariosIdUsuario;
    }

    public int getCitasIdCita() {
        return citasIdCita;
    }

    public void setCitasIdCita(int citasIdCita) {
        this.citasIdCita = citasIdCita;
    }

    public int getCategoriasIdCategoria() {
        return categoriasIdCategoria;
    }

    public void setCategoriasIdCategoria(int categoriasIdCategoria) {
        this.categoriasIdCategoria = categoriasIdCategoria;
    }

    public int getBorrado() {
        return borrado;
    }

    public void setBorrado(int borrado) {
        this.borrado = borrado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalle != null ? idDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        
        if (!(object instanceof DetalleCitas)) {
            return false;
        }
        DetalleCitas other = (DetalleCitas) object;
        if ((this.idDetalle == null && other.idDetalle != null) || (this.idDetalle != null && !this.idDetalle.equals(other.idDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "muebleria.DetalleCitas[ idDetalle=" + idDetalle + " ]";
    }
    
}
