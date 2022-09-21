
package com.lhportfolio.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="skillsoft")
public class Soft {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="tag")
    private String tag;
    @Column(name="modal")
    private String modal;
    @Column(name="beneficio")
    private String beneficio;
    @Column(name="porcentaje")
    private int porcentaje;
    
    public Soft() {
    }

    public Soft(Long id, String tag, String modal, String beneficio, int porcentaje) {
        this.id = id;
        this.tag = tag;
        this.modal = modal;
        this.beneficio = beneficio;
        this.porcentaje = porcentaje;
    }

    public Long getId() {
        return id;
    }

    public String getTag() {
        return tag;
    }

    public String getModal() {
        return modal;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
  
    
}
