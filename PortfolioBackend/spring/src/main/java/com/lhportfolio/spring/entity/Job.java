
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
@Table(name="jobs")
public class Job {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="job")
    private String job;
    @Column(name="cargo")
    private String cargo;
    @Column(name="funciones")
    private String funciones;
    @Column(name="ingreso_salida")  
    private String ingreso_salida;
    @Column(name="contacto")
    private String contacto;

    public Job() {
    }

    public Job(Long id, String job, String cargo, String funciones, String ingreso_salida, String contacto) {
        this.id = id;
        this.job = job;
        this.cargo = cargo;
        this.funciones = funciones;
        this.ingreso_salida = ingreso_salida;
        this.contacto = contacto;
    }
}
