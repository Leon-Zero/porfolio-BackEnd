
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IRedSocialService;
import com.lhportfolio.spring.entity.RedSocial;
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
//@CrossOrigin(origins = "http://localhost:4200")
public class RedSocialController {
        //metodos clase Red Social
    
    @Autowired
    private IRedSocialService rsServ;
    
    @GetMapping ("/btnrs")
    @ResponseBody
    public List<RedSocial> verRS(){
       return rsServ.verRS();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/btnrs")
    public void agregarRS(@RequestBody RedSocial rs){
        rsServ.crearRS(rs);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/btnrs/{id}")
    @ResponseBody
    public RedSocial selectRS( @PathVariable Long id){
       return rsServ.buscarRS(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/btnrs/{id}")
    public void borrarRS (@PathVariable Long id){
        rsServ.borrarRS(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/btnrs/{id}")
    public void editarRS (@PathVariable Long id, @RequestBody RedSocial rs){
        rsServ.editarRS(rs);
    }
}
