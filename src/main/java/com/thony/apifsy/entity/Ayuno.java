package com.thony.apifsy.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ayuno")
public class Ayuno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pregunta1;
    private String pregunta2;
    private String pregunta3;
    private String pregunta4;
    private String pregunta5;
    private String pregunta6;
    private String pregunta7;
    private String pregunta8;
    private String pregunta9;
    private String pregunta10;
    private String pregunta11;
    private String pregunta12;
    private String pregunta13;
    private String pregunta14;
    private String pregunta15;
    private String pregunta16;
    private String pregunta17;
    private String pregunta18;
    private String pregunta19;
    private String pregunta20;
    private String pregunta21;
    private String pregunta22;
    private String pregunta23;
    private String pregunta24;
    private String pregunta25;
    private String pregunta26;
    private String pregunta27;
    private String pregunta28;
    private String pregunta29;
    private String pregunta30;
    private String pregunta31;
    private String pregunta32;
    private String pregunta33;
    private String pregunta34;
    private String pregunta35;
    private String pregunta36;
    private String pregunta37;
    private String pregunta38;
    private String pregunta39;
    private String pregunta40;

    @ManyToOne()
    private Persona persona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPregunta1() {
        return pregunta1;
    }

    public void setPregunta1(String pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public String getPregunta2() {
        return pregunta2;
    }

    public void setPregunta2(String pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public String getPregunta3() {
        return pregunta3;
    }

    public void setPregunta3(String pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public String getPregunta4() {
        return pregunta4;
    }

    public void setPregunta4(String pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public String getPregunta5() {
        return pregunta5;
    }

    public void setPregunta5(String pregunta5) {
        this.pregunta5 = pregunta5;
    }

    public String getPregunta6() {
        return pregunta6;
    }

    public void setPregunta6(String pregunta6) {
        this.pregunta6 = pregunta6;
    }

    public String getPregunta7() {
        return pregunta7;
    }

    public void setPregunta7(String pregunta7) {
        this.pregunta7 = pregunta7;
    }

    public String getPregunta8() {
        return pregunta8;
    }

    public void setPregunta8(String pregunta8) {
        this.pregunta8 = pregunta8;
    }

    public String getPregunta9() {
        return pregunta9;
    }

    public void setPregunta9(String pregunta9) {
        this.pregunta9 = pregunta9;
    }

    public String getPregunta10() {
        return pregunta10;
    }

    public void setPregunta10(String pregunta10) {
        this.pregunta10 = pregunta10;
    }

    public String getPregunta11() {
        return pregunta11;
    }

    public void setPregunta11(String pregunta11) {
        this.pregunta11 = pregunta11;
    }

    public String getPregunta12() {
        return pregunta12;
    }

    public void setPregunta12(String pregunta12) {
        this.pregunta12 = pregunta12;
    }

    public String getPregunta13() {
        return pregunta13;
    }

    public void setPregunta13(String pregunta13) {
        this.pregunta13 = pregunta13;
    }

    public String getPregunta14() {
        return pregunta14;
    }

    public void setPregunta14(String pregunta14) {
        this.pregunta14 = pregunta14;
    }

    public String getPregunta15() {
        return pregunta15;
    }

    public void setPregunta15(String pregunta15) {
        this.pregunta15 = pregunta15;
    }

    public String getPregunta16() {
        return pregunta16;
    }

    public void setPregunta16(String pregunta16) {
        this.pregunta16 = pregunta16;
    }

    public String getPregunta17() {
        return pregunta17;
    }

    public void setPregunta17(String pregunta17) {
        this.pregunta17 = pregunta17;
    }

    public String getPregunta18() {
        return pregunta18;
    }

    public void setPregunta18(String pregunta18) {
        this.pregunta18 = pregunta18;
    }

    public String getPregunta19() {
        return pregunta19;
    }

    public void setPregunta19(String pregunta19) {
        this.pregunta19 = pregunta19;
    }

    public String getPregunta20() {
        return pregunta20;
    }

    public void setPregunta20(String pregunta20) {
        this.pregunta20 = pregunta20;
    }

    public String getPregunta21() {
        return pregunta21;
    }

    public void setPregunta21(String pregunta21) {
        this.pregunta21 = pregunta21;
    }

    public String getPregunta22() {
        return pregunta22;
    }

    public void setPregunta22(String pregunta22) {
        this.pregunta22 = pregunta22;
    }

    public String getPregunta23() {
        return pregunta23;
    }

    public void setPregunta23(String pregunta23) {
        this.pregunta23 = pregunta23;
    }

    public String getPregunta24() {
        return pregunta24;
    }

    public void setPregunta24(String pregunta24) {
        this.pregunta24 = pregunta24;
    }

    public String getPregunta25() {
        return pregunta25;
    }

    public void setPregunta25(String pregunta25) {
        this.pregunta25 = pregunta25;
    }

    public String getPregunta26() {
        return pregunta26;
    }

    public void setPregunta26(String pregunta26) {
        this.pregunta26 = pregunta26;
    }

    public String getPregunta27() {
        return pregunta27;
    }

    public void setPregunta27(String pregunta27) {
        this.pregunta27 = pregunta27;
    }

    public String getPregunta28() {
        return pregunta28;
    }

    public void setPregunta28(String pregunta28) {
        this.pregunta28 = pregunta28;
    }

    public String getPregunta29() {
        return pregunta29;
    }

    public void setPregunta29(String pregunta29) {
        this.pregunta29 = pregunta29;
    }

    public String getPregunta30() {
        return pregunta30;
    }

    public void setPregunta30(String pregunta30) {
        this.pregunta30 = pregunta30;
    }

    public String getPregunta31() {
        return pregunta31;
    }

    public void setPregunta31(String pregunta31) {
        this.pregunta31 = pregunta31;
    }

    public String getPregunta32() {
        return pregunta32;
    }

    public void setPregunta32(String pregunta32) {
        this.pregunta32 = pregunta32;
    }

    public String getPregunta33() {
        return pregunta33;
    }

    public void setPregunta33(String pregunta33) {
        this.pregunta33 = pregunta33;
    }

    public String getPregunta34() {
        return pregunta34;
    }

    public void setPregunta34(String pregunta34) {
        this.pregunta34 = pregunta34;
    }

    public String getPregunta35() {
        return pregunta35;
    }

    public void setPregunta35(String pregunta35) {
        this.pregunta35 = pregunta35;
    }

    public String getPregunta36() {
        return pregunta36;
    }

    public void setPregunta36(String pregunta36) {
        this.pregunta36 = pregunta36;
    }

    public String getPregunta37() {
        return pregunta37;
    }

    public void setPregunta37(String pregunta37) {
        this.pregunta37 = pregunta37;
    }

    public String getPregunta38() {
        return pregunta38;
    }

    public void setPregunta38(String pregunta38) {
        this.pregunta38 = pregunta38;
    }

    public String getPregunta39() {
        return pregunta39;
    }

    public void setPregunta39(String pregunta39) {
        this.pregunta39 = pregunta39;
    }

    public String getPregunta40() {
        return pregunta40;
    }

    public void setPregunta40(String pregunta40) {
        this.pregunta40 = pregunta40;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
