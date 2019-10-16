package com.thony.apifsy.entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "baile")
public class Baile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Boolean dance1;
    private Boolean dance2;
    private Boolean dance3;
    private Boolean dance4;
    private Boolean dance5;
    private Boolean dance6;
    private Boolean dance7;
    private Boolean dance8;
    private Boolean dance9;

    @ManyToOne
    private Persona persona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDance1() {
        return dance1;
    }

    public void setDance1(Boolean dance1) {
        this.dance1 = dance1;
    }

    public Boolean getDance2() {
        return dance2;
    }

    public void setDance2(Boolean dance2) {
        this.dance2 = dance2;
    }

    public Boolean getDance3() {
        return dance3;
    }

    public void setDance3(Boolean dance3) {
        this.dance3 = dance3;
    }

    public Boolean getDance4() {
        return dance4;
    }

    public void setDance4(Boolean dance4) {
        this.dance4 = dance4;
    }

    public Boolean getDance5() {
        return dance5;
    }

    public void setDance5(Boolean dance5) {
        this.dance5 = dance5;
    }

    public Boolean getDance6() {
        return dance6;
    }

    public void setDance6(Boolean dance6) {
        this.dance6 = dance6;
    }

    public Boolean getDance7() {
        return dance7;
    }

    public void setDance7(Boolean dance7) {
        this.dance7 = dance7;
    }

    public Boolean getDance8() {
        return dance8;
    }

    public void setDance8(Boolean dance8) {
        this.dance8 = dance8;
    }

    public Boolean getDance9() {
        return dance9;
    }

    public void setDance9(Boolean dance9) {
        this.dance9 = dance9;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
