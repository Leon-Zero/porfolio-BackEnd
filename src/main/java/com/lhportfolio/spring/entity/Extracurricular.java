
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
@Table(name="extracurricular")
public class Extracurricular {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="tipo", length = 50)
    private String tipo;
    @Column(name="actividad", length = 300)
    private String actividad;

    public Extracurricular() {
    }

    public Extracurricular(Long id, String tipo, String actividad) {
        this.id = id;
        this.tipo = tipo;
        this.actividad = actividad;
    }
    
}
