
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.model.Soft;
import java.util.List;


public interface ISoftService {
    public List<Soft> verSoft();
    public void crearSoft (Soft soft);
    public void borrarSoft (Long id);
    public Soft buscarSoft (Long id);
    public void editarSoft (Soft soft);
    
}
