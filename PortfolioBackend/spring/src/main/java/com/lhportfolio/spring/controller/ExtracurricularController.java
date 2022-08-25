
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IExtracurricularService;
import com.lhportfolio.spring.entity.Extracurricular;
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
public class ExtracurricularController {
     //metodos clase Extra Curricular
    @Autowired
    private IExtracurricularService extraServ;
       
    @PostMapping ("/extracurricular")
    public void agregarExtra(@RequestBody Extracurricular extra){
        extraServ.crearExtra(extra);
    }
    
    @GetMapping ("/extracurricular")
    @ResponseBody
    public List<Extracurricular> verExtra(){
       return extraServ.verExtra();
    }
    
    @GetMapping ("/extracurricular/{id}")
    @ResponseBody
    public Extracurricular selectExtra( @PathVariable Long id){
       return extraServ.buscarExtra(id);
    }
    
    @DeleteMapping ("/extracurricular/{id}")
    public void borrarExtra (@PathVariable Long id){
        extraServ.borrarExtra(id);
    }
    @PutMapping ("/extracurricular/{id}")
    public void editarExtra (@RequestBody Extracurricular extra, Long id){
        extraServ.editarExtra(extra);
    }
    
}
