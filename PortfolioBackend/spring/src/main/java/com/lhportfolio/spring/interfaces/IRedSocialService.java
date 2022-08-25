
package com.lhportfolio.spring.interfaces;

import com.lhportfolio.spring.model.RedSocial;
import java.util.List;


public interface IRedSocialService {
    
    public List<RedSocial> verRS();
    public void crearRS (RedSocial rs);
    public void borrarRS (Long id);
    public RedSocial buscarRS (Long id);
    public void editarRS (RedSocial rs);
    
    
}
