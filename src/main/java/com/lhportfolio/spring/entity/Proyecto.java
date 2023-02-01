
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
@Table(name="project")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="project_title", length = 80)
    private String project_title;
    @Column(name="project_text", length = 2000)
    private String project_text;
 
    //Datos de las CARDs
    
    @Column(name="card_img_1", length = 2000)
    private String card_img_1;
    @Column(name="card_icon_1", length = 100)
    private String card_icon_1;  
    @Column(name="card_title_1", length = 30)
    private String card_title_1; 
    @Column(name="card_description_1", length = 50)
    private String card_description_1;
    @Column(name="color_1", length = 50)
    private String color_1;
    
    // -----------
    @Column(name="card_img_2", length = 2000)
    private String card_img_2;
    @Column(name="card_icon_2", length = 100)
    private String card_icon_2;  
    @Column(name="card_title_2", length = 30)
    private String card_title_2; 
    @Column(name="card_description_2", length = 50)
    private String card_description_2;
    @Column(name="color_2", length = 50)
    private String color_2;
    // ------------
    @Column(name="card_img_3", length = 2000)
    private String card_img_3;
    @Column(name="card_icon_3", length = 100)
    private String card_icon_3;  
    @Column(name="card_title_3", length = 30)
    private String card_title_3; 
    @Column(name="card_description_3", length = 50)
    private String card_description_3;
    @Column(name="color_3", length = 50)
    private String color_3;
    //---------------------
    @Column(name="card_img_4", length = 2000)
    private String card_img_4;
    @Column(name="card_icon_4", length = 100)
    private String card_icon_4;  
    @Column(name="card_title_4", length = 30)
    private String card_title_4; 
    @Column(name="card_description_4", length = 50)
    private String card_description_4;
    @Column(name="color_4", length = 50)
    private String color_4;

    public Proyecto() {
    }

    public Proyecto(Long id, String project_title, String project_text, String card_img_1, String card_icon_1, String card_title_1, String card_description_1, String color_1,
            String card_img_2, String card_icon_2, String card_title_2, String card_description_2, String color_2,
            String card_img_3, String card_icon_3, String card_title_3, String card_description_3, String color_3,
            String card_img_4, String card_icon_4, String card_title_4, String card_description_4, String color_4) {
        this.id = id;
        this.project_title = project_title;
        this.project_text = project_text;
        this.card_img_1 = card_img_1;
        this.card_icon_1 = card_icon_1;
        this.card_title_1 = card_title_1;
        this.card_description_1 = card_description_1;
        this.color_1 = color_1;
        this.card_img_2 = card_img_2;
        this.card_icon_2 = card_icon_2;
        this.card_title_2 = card_title_2;
        this.card_description_2 = card_description_2;
        this.color_2 = color_2;
        this.card_img_3 = card_img_3;
        this.card_icon_3 = card_icon_3;
        this.card_title_3 = card_title_3;
        this.card_description_3 = card_description_3;
        this.color_3 = color_3;
        this.card_img_4 = card_img_4;
        this.card_icon_4 = card_icon_4;
        this.card_title_4 = card_title_4;
        this.card_description_4 = card_description_4;
        this.color_4 = color_4;
    }
    
}
