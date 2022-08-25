
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IIdiomaService;
import com.lhportfolio.spring.entity.Idioma;
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
public class IdiomaController {
    // Metodos clase Idioma
     @Autowired
    private IIdiomaService idiServ;
       
    @PostMapping ("/idioma")
    public void agregarIdioma(@RequestBody Idioma idi){
        idiServ.crearIdioma(idi);
    }
    
    @GetMapping ("/idioma")
    @ResponseBody
    public List<Idioma> verIdioma(){
       return idiServ.verIdioma();
    }
    
    @GetMapping ("/idioma/{id}")
    @ResponseBody
    public Idioma selectIdioma( @PathVariable Long id){
       return idiServ.buscarIdioma(id);
    }
    
    @DeleteMapping ("/idioma/{id}")
    public void borrarIdioma (@PathVariable Long id){
        idiServ.borrarIdioma(id);
    }
    @PutMapping ("/idioma/{id}")
    public void editarIdioma (@RequestBody Idioma idi, Long id){
        idiServ.editarIdioma(idi);
    }
    
}
