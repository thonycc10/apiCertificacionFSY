package com.thony.apifsy.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "persona")
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String password;
    private Integer telefono;
    private String vista;
    private String calificacion;
    private String estaca;
    private Long idPadre;
    private Long idRol;
}
