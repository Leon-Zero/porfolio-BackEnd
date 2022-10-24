
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IExtracurricularService;
import com.lhportfolio.spring.entity.Extracurricular;
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
public class ExtracurricularController {
     //metodos clase Extra Curricular
    @Autowired
    private IExtracurricularService extraServ;
    
    @GetMapping ("/extracurricular")
    @ResponseBody
    public List<Extracurricular> verExtra(){
       return extraServ.verExtra();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/extracurricular")
    public void agregarExtra(@RequestBody Extracurricular extra){
        extraServ.crearExtra(extra);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/extracurricular/{id}")
    @ResponseBody
    public Extracurricular selectExtra( @PathVariable Long id){
       return extraServ.buscarExtra(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/extracurricular/{id}")
    public void borrarExtra (@PathVariable Long id){
        extraServ.borrarExtra(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/extracurricular/{id}")
    public void editarExtra (@PathVariable Long id, @RequestBody Extracurricular extra){
        extraServ.editarExtra(extra);
    }
    
}
