
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IDatosService;
import com.lhportfolio.spring.model.Datos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lhportfolio.spring.repository.DatosRepository;

@Service
public class DatosService implements IDatosService {
    
     @Autowired
    public DatosRepository datosRepo;

    @Override
    public List<Datos> verDatos() {
    return datosRepo.findAll();
    }

    @Override
    public Datos buscarDatos(Long id) {
    return datosRepo.findById(id).orElse(null);
    }

    @Override
    public void editarDatos(Datos dat) {
    datosRepo.save(dat);
    }
        
}
