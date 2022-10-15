
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
@Table(name="datos")
public class Datos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="title_name", length = 50)
    private String title_name;
    @Column(name="name", length = 50)
    private String name;
    @Column(name="ubicacion", length = 80)
    private String ubicacion;
    @Column(name="school", length = 100)
    private String school;
    @Column(name="perfil", length = 250)
    private String perfil;
    
    public Datos() {
    }

    public Datos(Long id, String title_name, String name, String ubicacion, String school, String perfil) {
        this.id = id;
        this.title_name = title_name;
        this.name = name;
        this.ubicacion = ubicacion;
        this.school = school;
        this.perfil = perfil;
    }

    
    
}


