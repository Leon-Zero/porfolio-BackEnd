
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IAcademicaService;
import com.lhportfolio.spring.model.Academica;
import com.lhportfolio.spring.repository.AcademicaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademicaService implements IAcademicaService{
    
    @Autowired
    public AcademicaRepository acaRepo;

    @Override
    public List<Academica> verAcademica() {
    return acaRepo.findAll();
    }

    @Override
    public void crearAcademica(Academica aca) {
    acaRepo.save(aca);
    }

    @Override
    public void borrarAcademica(Long id) {
    acaRepo.deleteById(id);
    }

    @Override
    public Academica buscarAcademica(Long id) {
    return acaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarAcademica(Academica aca) {
    acaRepo.save(aca);
    }
    
}
