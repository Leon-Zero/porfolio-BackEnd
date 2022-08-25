
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IRedSocialService;
import com.lhportfolio.spring.entity.RedSocial;
import com.lhportfolio.spring.repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService implements IRedSocialService {

    @Autowired
    public RedSocialRepository rsRepo;
    
    @Override
    public List<RedSocial> verRS() {
    return rsRepo.findAll();
    }

    @Override
    public void crearRS(RedSocial rs) {
    rsRepo.save(rs);
    }

    @Override
    public void borrarRS(Long id) {
    rsRepo.deleteById(id);
    }

    @Override
    public RedSocial buscarRS(Long id) {
    return rsRepo.findById(id).orElse(null);
    }

    @Override
    public void editarRS(RedSocial rs) {
    rsRepo.save(rs);
    }
    
}
