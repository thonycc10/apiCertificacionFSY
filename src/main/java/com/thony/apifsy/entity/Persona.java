package com.thony.apifsy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Integer dni;
    private String password;
    private Integer telefono;
    private String vista;
    private String calificacion;
    private String estaca;
    private String correo;
    private String cargo;
    private Long idPadre;

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private Set<Baile> bailes = new HashSet<>();

    @OneToMany(mappedBy = "persona")
    @JsonIgnore
    private Set<Ayuno> ayunos = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getVista() {
        return vista;
    }

    public void setVista(String vista) {
        this.vista = vista;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstaca() {
        return estaca;
    }

    public void setEstaca(String estaca) {
        this.estaca = estaca;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Long getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Long idPadre) {
        this.idPadre = idPadre;
    }

    public Set<Baile> getBailes() {
        return bailes;
    }

    public void setBailes(Set<Baile> bailes) {
        this.bailes = bailes;
    }

    public Set<Ayuno> getAyunos() {
        return ayunos;
    }

    public void setAyunos(Set<Ayuno> ayunos) {
        this.ayunos = ayunos;
    }
}
