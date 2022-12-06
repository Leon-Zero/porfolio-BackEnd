
package com.lhportfolio.spring.controller;


import com.lhportfolio.spring.entity.Proyecto;
import com.lhportfolio.spring.interfaces.IProyectoService;
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
//@CrossOrigin(origins = "https://portfolio-lh.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
     //metodos clase Proyecto
    @Autowired
    private IProyectoService proyectoServ;
    
     @GetMapping("/proyecto")
    @ResponseBody
    public List<Proyecto>verProyecto(){
       return proyectoServ.verProyecto();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyecto")
    public void agregarProyecto(@RequestBody Proyecto proyecto){
        proyectoServ.crearProyecto(proyecto);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/proyecto/{id}")
    @ResponseBody
    public Proyecto selectProyecto(@PathVariable Long id){
       return proyectoServ.buscarProyecto(id);
    }
    
   @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
    }
    
   @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/proyecto/{id}")
    public void editarProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto){
        proyectoServ.editarProyecto(proyecto);
    }    
    
}
