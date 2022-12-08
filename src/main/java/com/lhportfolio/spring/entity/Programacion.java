
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
@Table(name="skillprograming")
public class Programacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="tag", length = 50)
    private String tag;
    @Column(name="porcentaje")
    private int porcentaje;
    @Column(name="color", length = 25)
    private String color;

    public Programacion() {
    }

    public Programacion(Long id, String tag, int porcentaje, String color) {
        this.id = id;
        this.tag = tag;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
    
}
