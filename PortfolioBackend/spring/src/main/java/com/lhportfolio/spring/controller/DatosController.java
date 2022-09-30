package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.entity.Datos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lhportfolio.spring.interfaces.IDatosService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DatosController {
    
    //metodos clase Datos
    @Autowired
    private IDatosService datosServ;
    
    @GetMapping ("/datos")
    @ResponseBody
    public List<Datos> verDatos(){
       return datosServ.verDatos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/datos")
    public void agregarDatos(@RequestBody Datos datos){
        datosServ.crearDatos(datos);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/datos/{id}")
    public void borrarDatos (@PathVariable Long id){
        datosServ.borrarDatos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/datos/{id}")
    @ResponseBody
    public Datos selectDatos( @PathVariable Long id){
       return datosServ.buscarDatos(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/datos/{id}")
    public void editarDatos (@PathVariable Long id, @RequestBody Datos dat){
        datosServ.editarDatos(dat);
    }
      
}
