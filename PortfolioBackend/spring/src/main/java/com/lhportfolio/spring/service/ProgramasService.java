
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IProgramasService;
import com.lhportfolio.spring.model.Programas;
import com.lhportfolio.spring.repository.ProgramasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramasService implements IProgramasService{
    
    @Autowired
    public ProgramasRepository pmasRepo;

    @Override
    public List<Programas> verPmas() {
    return pmasRepo.findAll();
    }

    @Override
    public void crearPmas(Programas pmas) {
    pmasRepo.save(pmas);
    }

    @Override
    public void borrarPmas(Long id) {
    pmasRepo.deleteById(id);
    }

    @Override
    public Programas buscarPmas(Long id) {
    return pmasRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPmas(Programas pmas) {
    pmasRepo.save(pmas);
    }
    
}
