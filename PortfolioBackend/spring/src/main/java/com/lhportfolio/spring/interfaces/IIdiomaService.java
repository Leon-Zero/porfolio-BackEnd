
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.entity.Idioma;
import java.util.List;


public interface IIdiomaService {
    public List<Idioma> verIdioma();
    public void crearIdioma (Idioma idi);
    public void borrarIdioma (Long id);
    public Idioma buscarIdioma (Long id);
    public void editarIdioma (Idioma idi);
    
}
