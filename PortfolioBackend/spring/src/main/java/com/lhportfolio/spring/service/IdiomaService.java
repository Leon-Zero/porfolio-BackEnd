
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IIdiomaService;
import com.lhportfolio.spring.model.Idioma;
import com.lhportfolio.spring.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {
    
    @Autowired
    public IdiomaRepository idiRepo;

    @Override
    public List<Idioma> verIdioma() {
    return idiRepo.findAll();
    }

    @Override
    public void crearIdioma(Idioma idi) {
    idiRepo.save(idi);
    }

    @Override
    public void borrarIdioma(Long id) {
    idiRepo.deleteById(id);
    }

    @Override
    public Idioma buscarIdioma(Long id) {
    return idiRepo.findById(id).orElse(null);
    }

    @Override
    public void editarIdioma(Idioma idi) {
    idiRepo.save(idi);
    }
    
}
