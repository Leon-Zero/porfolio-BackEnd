
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IExtracurricularService;
import com.lhportfolio.spring.entity.Extracurricular;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lhportfolio.spring.repository.ExtracurricularRepository;

@Service
public class ExtracurricularService implements IExtracurricularService{

     @Autowired
    public ExtracurricularRepository extraRepo;
     
    @Override
    public List<Extracurricular> verExtra() {
    return extraRepo.findAll();
    }

    @Override
    public void crearExtra(Extracurricular extra) {
    extraRepo.save(extra);
    }

    @Override
    public void borrarExtra(Long id) {
    extraRepo.deleteById(id);
    }

    @Override
    public Extracurricular buscarExtra(Long id) {
    return extraRepo.findById(id).orElse(null);
    }

    @Override
    public void editarExtra(Extracurricular extra) {
    extraRepo.save(extra);
    }
    
}
