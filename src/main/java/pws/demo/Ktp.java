/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pws.demo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "ktp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ktp.findAll", query = "SELECT k FROM Ktp k"),
    @NamedQuery(name = "Ktp.findById", query = "SELECT k FROM Ktp k WHERE k.id = :id"),
    @NamedQuery(name = "Ktp.findByNama", query = "SELECT k FROM Ktp k WHERE k.nama = :nama"),
    @NamedQuery(name = "Ktp.findByNik", query = "SELECT k FROM Ktp k WHERE k.nik = :nik"),
    @NamedQuery(name = "Ktp.findByAlamat", query = "SELECT k FROM Ktp k WHERE k.alamat = :alamat")})
public class Ktp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Nama")
    private String nama;
    @Column(name = "NIK")
    private Integer nik;
    @Column(name = "Alamat")
    private String alamat;
    @Lob
    @Column(name = "Photo")
    private byte[] photo;

    public Ktp() {
    }

    public Ktp(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getNik() {
        return nik;
    }

    public void setNik(Integer nik) {
        this.nik = nik;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
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
        if (!(object instanceof Ktp)) {
            return false;
        }
        Ktp other = (Ktp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pws.demo.Ktp[ id=" + id + " ]";
    }
    
}
