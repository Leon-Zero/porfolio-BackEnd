
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Extracurricular;
import java.util.List;


public interface IExtracurricularService {
    public List<Extracurricular> verExtra();
    public void crearExtra (Extracurricular extra);
    public void borrarExtra (Long id);
    public Extracurricular buscarExtra (Long id);
    public void editarExtra (Extracurricular extra);
    
}
