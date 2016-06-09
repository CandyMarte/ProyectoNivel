/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.entidades.jpa;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Candy Marte
 */
@Entity
@Table(name = "correo_ciudadanos", catalog = "ciudadanos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Correo.findAll", query = "SELECT c FROM Correo c"),
    @NamedQuery(name = "Correo.findById", query = "SELECT c FROM Correo c WHERE c.id = :id"),
    @NamedQuery(name = "Correo.findByCorreoElectronico", query = "SELECT c FROM Correo c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Correo.findByIdCiudadano", query = "SELECT c FROM Correo c WHERE c.idCiudadano = :idCiudadano")})
public class Correo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo_electronico", nullable = false, length = 100)
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_ciudadano", nullable = false)
    private int idCiudadano;

    public Correo() {
    }

    public Correo(Integer id) {
        this.id = id;
    }

    public Correo(Integer id, String correoElectronico, int idCiudadano) {
        this.id = id;
        this.correoElectronico = correoElectronico;
        this.idCiudadano = idCiudadano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getIdCiudadano() {
        return idCiudadano;
    }

    public void setIdCiudadano(int idCiudadano) {
        this.idCiudadano = idCiudadano;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Correo)) {
            return false;
        }
        Correo other = (Correo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.jpa.Correo[ id=" + id + " ]";
    }
    
}
