/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pasi9
 */
@Entity
@Table(name = "votante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Votante.findAll", query = "SELECT v FROM Votante v")
    , @NamedQuery(name = "Votante.findById", query = "SELECT v FROM Votante v WHERE v.id = :id")
    , @NamedQuery(name = "Votante.findByDni", query = "SELECT v FROM Votante v WHERE v.dni = :dni")
    , @NamedQuery(name = "Votante.findByNombre", query = "SELECT v FROM Votante v WHERE v.nombre = :nombre")
    , @NamedQuery(name = "Votante.findByApellido", query = "SELECT v FROM Votante v WHERE v.apellido = :apellido")
    , @NamedQuery(name = "Votante.findByVoto", query = "SELECT v FROM Votante v WHERE v.voto = :voto")})
public class Votante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DNI")
    private String dni;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Apellido")
    private String apellido;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Contrasena")
    private byte[] contrasena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "Voto")
    private String voto;

    public Votante() {
    }

    public Votante(Integer id) {
        this.id = id;
    }

    public Votante(Integer id, String dni, String nombre, String apellido, byte[] contrasena, String voto) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasena = contrasena;
        this.voto = voto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public byte[] getContrasena() {
        return contrasena;
    }

    public void setContrasena(byte[] contrasena) {
        this.contrasena = contrasena;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
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
        if (!(object instanceof Votante)) {
            return false;
        }
        Votante other = (Votante) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Votante[ id=" + id + " ]";
    }
    
}
