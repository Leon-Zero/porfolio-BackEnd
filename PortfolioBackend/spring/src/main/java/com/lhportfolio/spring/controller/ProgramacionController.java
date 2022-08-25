
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IProgramacionService;
import com.lhportfolio.spring.entity.Programacion;
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
public class ProgramacionController {
     //metodos clase Programacion
       @Autowired
    private IProgramacionService pcionServ;
       
    @PostMapping ("/programacion")
    public void agregarProgramacion(@RequestBody Programacion pcion){
        pcionServ.crearPcion(pcion);
    }
    
    @GetMapping ("/programacion")
    @ResponseBody
    public List<Programacion> verPcion(){
       return pcionServ.verPcion();
    }
    
    @GetMapping ("/programacion/{id}")
    @ResponseBody
    public Programacion selectPcion( @PathVariable Long id){
       return pcionServ.buscarPcion(id);
    }
    
    @DeleteMapping ("/programacion/{id}")
    public void borrarProgramacion (@PathVariable Long id){
        pcionServ.borrarPcion(id);
    }
    @PutMapping ("/programacion/{id}")
    public void editarPcion (@RequestBody Programacion pcion, Long id){
        pcionServ.editarPcion(pcion);
    }
}
