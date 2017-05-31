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
@Table(name = "reloj")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reloj.findAll", query = "SELECT r FROM Reloj r")
    , @NamedQuery(name = "Reloj.findById", query = "SELECT r FROM Reloj r WHERE r.id = :id")
    , @NamedQuery(name = "Reloj.findByMarca", query = "SELECT r FROM Reloj r WHERE r.marca = :marca")
    , @NamedQuery(name = "Reloj.findByVotos", query = "SELECT r FROM Reloj r WHERE r.votos = :votos")})
public class Reloj implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Marca")
    private String marca;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Votos")
    private int votos;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "Icono")
    private byte[] icono;

    public Reloj() {
    }

    public Reloj(Integer id) {
        this.id = id;
    }

    public Reloj(Integer id, String marca, int votos, byte[] icono) {
        this.id = id;
        this.marca = marca;
        this.votos = votos;
        this.icono = icono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVotos() {
        return votos;
    }

    public void setVotos(int votos) {
        this.votos = votos;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
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
        if (!(object instanceof Reloj)) {
            return false;
        }
        Reloj other = (Reloj) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Reloj[ id=" + id + " ]";
    }
    
}
