
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
@Table(name="extracurricular")
public class Extracurricular {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="tipo")
    private String tipo;
    @Column(name="actividad")
    private String actividad;
    
    @Column(name="academica_id")
    private Long academica_id;

    public Extracurricular() {
    }

    public Extracurricular(Long id, String tipo, String actividad, Long academica_id) {
        this.id = id;
        this.tipo = tipo;
        this.actividad = actividad;
        this.academica_id = academica_id;
    }
    
}
