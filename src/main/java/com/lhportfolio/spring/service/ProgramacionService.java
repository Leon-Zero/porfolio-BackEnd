
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IProgramacionService;
import com.lhportfolio.spring.entity.Programacion;
import com.lhportfolio.spring.repository.ProgramacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramacionService implements IProgramacionService {
    
    @Autowired
    public ProgramacionRepository pcionRepo;

    @Override
    public List<Programacion> verPcion() {
    return pcionRepo.findAll();
    }

    @Override
    public void crearPcion(Programacion pcion) {
    pcionRepo.save(pcion);
    }

    @Override
    public void borrarPcion(Long id) {
    pcionRepo.deleteById(id);
    }

    @Override
    public Programacion buscarPcion(Long id) {
    return pcionRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPcion(Programacion pcion) {
    pcionRepo.save(pcion);
    }
    
}
