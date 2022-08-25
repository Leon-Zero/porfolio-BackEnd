
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.model.Datos;
import java.util.List;


public interface IDatosService {
    public List<Datos> verDatos();
    public Datos buscarDatos (Long id);
    public void editarDatos (Datos dat);
}
