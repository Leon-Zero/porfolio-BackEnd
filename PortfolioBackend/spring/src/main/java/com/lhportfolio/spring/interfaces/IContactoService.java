
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Contacto;
import java.util.List;


public interface IContactoService {
    
    public List<Contacto> verContacto();

    public void crearContacto(Contacto contacto);

    public void borrarContacto(Long id);

    public Contacto buscarContacto(Long id);

    public void editarContacto(Contacto contacto);
    
}
