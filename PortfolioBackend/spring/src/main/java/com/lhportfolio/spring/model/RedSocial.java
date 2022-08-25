
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
@Table(name="btnrs")
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="red_social")
    private String red_social;
    @Column(name="btn")
    private String btn;
    @Column(name="url")
    private String url;
    @Column(name="color")
    private String color;
    @Column(name="datos_id")
    private Long datos_id;

    public RedSocial() {
    }

    public RedSocial(Long id, String red_social, String btn, String url, String color, Long datos_id) {
        this.id = id;
        this.red_social = red_social;
        this.btn = btn;
        this.url = url;
        this.color = color;
        this.datos_id = datos_id;
    }
    
    
    
}
