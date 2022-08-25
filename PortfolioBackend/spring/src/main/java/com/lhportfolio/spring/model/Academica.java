
package com.lhportfolio.spring.model;

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
    @Column(name="titulo_tag")
    private String titulo_tag;
    @Column(name="instituto")
    private String instituto;
    @Column(name="logo")
    private String logo;
    @Column(name="carrera")
    private String carrera;
    @Column(name="estado")
    private String estado;
    @Column(name="ingreso")
    private String ingreso;
    
    @Column(name="datos_id")
    private Long datos_id;

    public Academica() {
    }

    public Academica(Long id, String titulo_tag, String instituto, String logo, String carrera, String estado, String ingreso, Long datos_id) {
        this.id = id;
        this.titulo_tag = titulo_tag;
        this.instituto = instituto;
        this.logo = logo;
        this.carrera = carrera;
        this.estado = estado;
        this.ingreso = ingreso;
        this.datos_id = datos_id;
    }

   

   

   
}
