
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.ISoftService;
import com.lhportfolio.spring.entity.Soft;
import com.lhportfolio.spring.repository.SoftRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftService implements ISoftService{
    
    @Autowired
    public SoftRepository softRepo;

    @Override
    public List<Soft> verSoft() {
    return softRepo.findAll();
    }

    @Override
    public void crearSoft(Soft soft) {
    softRepo.save(soft);
    }

    @Override
    public void borrarSoft(Long id) {
    softRepo.deleteById(id);
    }

    @Override
    public Soft buscarSoft(Long id) {
    return softRepo.findById(id).orElse(null);
    }

    @Override
    public void editarSoft(Soft soft) {
    softRepo.save(soft);
    }
    
}
