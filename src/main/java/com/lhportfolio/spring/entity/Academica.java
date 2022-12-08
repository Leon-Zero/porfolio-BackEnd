
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
@Table(name="academica")
public class Academica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="titulo_tag", length = 80)
    private String titulo_tag;
    @Column(name="instituto", length = 250)
    private String instituto;
    @Column(name="logo", length = 250)
    private String logo;
    @Column(name="carrera", length = 250)
    private String carrera;
    @Column(name="estado", length = 100)
    private String estado;
    @Column(name="ingreso", length = 120)
    private String ingreso;

    public Academica() {
    }

    public Academica(Long id, String titulo_tag, String instituto, String logo, String carrera, String estado, String ingreso) {
        this.id = id;
        this.titulo_tag = titulo_tag;
        this.instituto = instituto;
        this.logo = logo;
        this.carrera = carrera;
        this.estado = estado;
        this.ingreso = ingreso;
    }

   

   

   
}
