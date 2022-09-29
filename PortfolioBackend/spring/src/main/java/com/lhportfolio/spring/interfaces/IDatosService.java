
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Datos;
import java.util.List;


public interface IDatosService {
    public List<Datos> verDatos();
    public void crearDatos (Datos datos);
    public void borrarDatos (Long id);
    public Datos buscarDatos (Long id);
    public void editarDatos (Datos datos);
}
