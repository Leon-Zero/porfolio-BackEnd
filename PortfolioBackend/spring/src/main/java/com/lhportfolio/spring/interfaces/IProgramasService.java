package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Programas;
import java.util.List;

public interface IProgramasService {

    public List<Programas> verPmas();

    public void crearPmas(Programas pmas);

    public void borrarPmas(Long id);

    public Programas buscarPmas(Long id);

    public void editarPmas(Programas pmas);
}
