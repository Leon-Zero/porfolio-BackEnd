
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IProgramasService;
import com.lhportfolio.spring.model.Programas;
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
public class ProgramasController {
    //Metodos clase Programas
     @Autowired
    private IProgramasService pmasServ;
       
    @PostMapping ("/programas")
    public void agregarPmas(@RequestBody Programas pmas){
        pmasServ.crearPmas(pmas);
    }
    
    @GetMapping ("/programas")
    @ResponseBody
    public List<Programas> verPmas(){
       return pmasServ.verPmas();
    }
    
    @GetMapping ("/programas/{id}")
    @ResponseBody
    public Programas selectPmas( @PathVariable Long id){
       return pmasServ.buscarPmas(id);
    }
    
    @DeleteMapping ("/programas/{id}")
    public void borrarPmas (@PathVariable Long id){
        pmasServ.borrarPmas(id);
    }
    @PutMapping ("/programas/{id}")
    public void editarPmas (@RequestBody Programas pmas, Long id){
        pmasServ.editarPmas(pmas);
    }
}
