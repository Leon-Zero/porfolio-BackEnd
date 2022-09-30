package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Programacion;
import java.util.List;

public interface IProgramacionService {

    public List<Programacion> verPcion();

    public void crearPcion(Programacion pcion);

    public void borrarPcion(Long id);

    public Programacion buscarPcion(Long id);

    public void editarPcion(Programacion pcion);
}
