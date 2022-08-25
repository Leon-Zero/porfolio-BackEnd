
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Academica;
import java.util.List;

public interface IAcademicaService {
    
    public List<Academica> verAcademica();
    public void crearAcademica (Academica aca);
    public void borrarAcademica (Long id);
    public Academica buscarAcademica (Long id);
    public void editarAcademica (Academica aca);
    
}
