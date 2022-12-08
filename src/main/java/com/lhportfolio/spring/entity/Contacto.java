
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
@Table(name="contacto")
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="mail", length = 150)
    private String mail;
    @Column(name="asunto", length = 50)
    private String asunto;
    @Column(name="mensaje", length = 250)
    private String mensaje;

    public Contacto() {
    }

    public Contacto(Long id, String mail, String asunto, String mensaje) {
        this.id = id;
        this.mail = mail;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }    
}
