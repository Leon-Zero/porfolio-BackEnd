
package com.lhportfolio.spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
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
}
