
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.entity.Contacto;
import com.lhportfolio.spring.interfaces.IContactoService;
import com.lhportfolio.spring.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService implements IContactoService{
    
    @Autowired
    public ContactoRepository contactoRepo;

    @Override
    public List<Contacto> verContacto() {
    return contactoRepo.findAll();

    }

    @Override
    public void crearContacto(Contacto contacto) {
    contactoRepo.save(contacto);
    }

    @Override
    public void borrarContacto(Long id) {
    contactoRepo.deleteById(id);
    }

    @Override
    public Contacto buscarContacto(Long id) {
    return contactoRepo.findById(id).orElse(null);
    }

    @Override
    public void editarContacto(Contacto contacto) {
    contactoRepo.save(contacto);
    }
    
}
