
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
@Table(name="btnrs")
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="red_social", length = 25)
    private String red_social;
    @Column(name="btn", length = 100)
    private String btn;
    @Column(name="url", length = 250)
    private String url;
    @Column(name="color", length = 100)
    private String color;
   

    public RedSocial() {
    }

    public RedSocial(Long id, String red_social, String btn, String url, String color) {
        this.id = id;
        this.red_social = red_social;
        this.btn = btn;
        this.url = url;
        this.color = color;
    }
    
    
    
}
