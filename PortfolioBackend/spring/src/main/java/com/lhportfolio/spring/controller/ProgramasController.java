
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IProgramasService;
import com.lhportfolio.spring.entity.Programas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://portfolio-lh.web.app")
public class ProgramasController {
    //Metodos clase Programas
     @Autowired
    private IProgramasService pmasServ;
    
    @GetMapping ("/programas")
    @ResponseBody
    public List<Programas> verPmas(){
       return pmasServ.verPmas();
    }
     
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/programas")
    public void agregarPmas(@RequestBody Programas pmas){
        pmasServ.crearPmas(pmas);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/programas/{id}")
    @ResponseBody
    public Programas selectPmas( @PathVariable Long id){
       return pmasServ.buscarPmas(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/programas/{id}")
    public void borrarPmas (@PathVariable Long id){
        pmasServ.borrarPmas(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/programas/{id}")
    public void editarPmas (@PathVariable Long id, @RequestBody Programas pmas){
        pmasServ.editarPmas(pmas);
    }
}
