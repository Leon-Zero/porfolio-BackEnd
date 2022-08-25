
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.ISoftService;
import com.lhportfolio.spring.model.Soft;
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
public class SoftController {
    
    //metodos clase Soft
      @Autowired
    private ISoftService softServ;
       
    @PostMapping ("/soft")
    public void agregarSoft(@RequestBody Soft soft){
        softServ.crearSoft(soft);
    }
    
    @GetMapping ("/soft")
    @ResponseBody
    public List<Soft> verSoft(){
       return softServ.verSoft();
    }
    
    @GetMapping ("/soft/{id}")
    @ResponseBody
    public Soft selectSoft( @PathVariable Long id){
       return softServ.buscarSoft(id);
    }
    
    @DeleteMapping ("/soft/{id}")
    public void borrarSoft (@PathVariable Long id){
        softServ.borrarSoft(id);
    }
    @PutMapping ("/soft/{id}")
    public void editarSoft (@RequestBody Soft soft, Long id){
        softServ.editarSoft(soft);
    }

}
