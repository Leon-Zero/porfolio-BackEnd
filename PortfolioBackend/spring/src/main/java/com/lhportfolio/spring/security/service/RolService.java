
package com.lhportfolio.spring.security.service;

import com.lhportfolio.spring.security.entity.Rol;
import com.lhportfolio.spring.security.enums.RolNombre;
import com.lhportfolio.spring.security.repository.RolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }
    
            
            
            
            
}
