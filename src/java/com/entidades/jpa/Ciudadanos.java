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
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Candy Marte
 */
@Entity
@Table(name = "datos_ciudadanos", catalog = "ciudadanos", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ciudadanos.findAll", query = "SELECT c FROM Ciudadanos c"),
    @NamedQuery(name = "Ciudadanos.findById", query = "SELECT c FROM Ciudadanos c WHERE c.id = :id"),
    @NamedQuery(name = "Ciudadanos.findByNombre", query = "SELECT c FROM Ciudadanos c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "Ciudadanos.findByApellido", query = "SELECT c FROM Ciudadanos c WHERE c.apellido = :apellido"),
    @NamedQuery(name = "Ciudadanos.findBySexo", query = "SELECT c FROM Ciudadanos c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Ciudadanos.findByFechaNacimiento", query = "SELECT c FROM Ciudadanos c WHERE c.fechaNacimiento = :fechaNacimiento"),
    @NamedQuery(name = "Ciudadanos.findByCorreoElectronico", query = "SELECT c FROM Ciudadanos c WHERE c.correoElectronico = :correoElectronico"),
    @NamedQuery(name = "Ciudadanos.findByTelefono", query = "SELECT c FROM Ciudadanos c WHERE c.telefono = :telefono")})
public class Ciudadanos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Size(max = 60)
    @Column(name = "nombre", length = 60)
    private String nombre;
    @Size(max = 80)
    @Column(name = "apellido", length = 80)
    private String apellido;
    @Size(max = 10)
    @Column(name = "sexo", length = 10)
    private String sexo;
    @Size(max = 15)
    @Column(name = "fecha_nacimiento", length = 15)
    private String fechaNacimiento;
    @Lob
    @Size(max = 65535)
    @Column(name = "direccion", length = 65535)
    private String direccion;
    @Size(max = 60)
    @Column(name = "correo_electronico", length = 60)
    private String correoElectronico;
    @Size(max = 20)
    @Column(name = "telefono", length = 20)
    private String telefono;

    public Ciudadanos() {
    }

    public Ciudadanos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
        if (!(object instanceof Ciudadanos)) {
            return false;
        }
        Ciudadanos other = (Ciudadanos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.jpa.Ciudadanos[ id=" + id + " ]";
    }
    
}
