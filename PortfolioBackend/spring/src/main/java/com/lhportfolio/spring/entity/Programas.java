
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
@Table(name="skillprograms")
public class Programas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="tag")
    private String tag;
    @Column(name="porcentaje")
    private int porcentaje;
    @Column(name="color")
    private String color;
    //@Column(name="datos_id")
    //private Long datos_id;

    public Programas() {
    }

    public Programas(Long id, String tag, int porcentaje, String color, Long datos_id) {
        this.id = id;
        this.tag = tag;
        this.porcentaje = porcentaje;
        this.color = color;
      //  this.datos_id = datos_id;
    }
    
    
    
}
