
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IRedSocialService;
import com.lhportfolio.spring.model.RedSocial;
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
public class RedSocialController {
        //metodos clase Red Social
    
    @Autowired
    private IRedSocialService rsServ;
       
    @PostMapping ("/btnrs")
    public void agregarRS(@RequestBody RedSocial rs){
        rsServ.crearRS(rs);
    }
    
    @GetMapping ("/btnrs")
    @ResponseBody
    public List<RedSocial> verRS(){
       return rsServ.verRS();
    }
    
    @GetMapping ("/btnrs/{id}")
    @ResponseBody
    public RedSocial selectRS( @PathVariable Long id){
       return rsServ.buscarRS(id);
    }
    
    @DeleteMapping ("/btnrs/{id}")
    public void borrarRS (@PathVariable Long id){
        rsServ.borrarRS(id);
    }
    @PutMapping ("/btnrs/{id}")
    public void editarRS (@RequestBody RedSocial rs, Long id){
        rsServ.editarRS(rs);
    }
}
