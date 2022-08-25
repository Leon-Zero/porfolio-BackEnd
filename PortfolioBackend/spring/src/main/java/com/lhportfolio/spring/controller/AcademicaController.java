
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IAcademicaService;
import com.lhportfolio.spring.model.Academica;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcademicaController {
    
     //Metodos clase Academica
    
    @Autowired
    private IAcademicaService acaServ;
       
    @PostMapping ("/academica")
    public void agregarAcademica(@RequestBody Academica aca){
        acaServ.crearAcademica(aca);
    }
    
    @GetMapping ("/academica")
    @ResponseBody
    public List<Academica> verAcademica(){
       return acaServ.verAcademica();
    }
    
    @GetMapping ("/academica/{id}")
    @ResponseBody
    public Academica selectAcademica( @PathVariable Long id){
       return acaServ.buscarAcademica(id);
    }
    
    @DeleteMapping ("/academica/{id}")
    public void borrarAcademica (@PathVariable Long id){
        acaServ.borrarAcademica(id);
    }
    @PutMapping ("/academica/{id}")
    public void editarAcademica (@RequestBody Academica aca, Long id){
        acaServ.editarAcademica(aca);
    }
    
}
