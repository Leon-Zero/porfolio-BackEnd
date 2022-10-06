
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.entity.Contacto;
import com.lhportfolio.spring.interfaces.IContactoService;
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
@CrossOrigin(origins = "http://localhost:4200")
public class ContactoController {
    
     @Autowired
    private IContactoService contactoServ;
     
     @GetMapping ("/contacto")
    @ResponseBody
    public List<Contacto> verContacto(){
       return contactoServ.verContacto();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/contacto")
    public void agregarContacto(@RequestBody Contacto contacto){
        contactoServ.crearContacto(contacto);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/contacto/{id}")
    @ResponseBody
    public Contacto selectContacto( @PathVariable Long id){
       return contactoServ.buscarContacto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/contacto/{id}")
    public void borrarContacto (@PathVariable Long id){
        contactoServ.borrarContacto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/contacto/{id}")
    public void editarContacto (@PathVariable Long id, @RequestBody Contacto contacto){
        contactoServ.editarContacto(contacto);
    }
    
}
