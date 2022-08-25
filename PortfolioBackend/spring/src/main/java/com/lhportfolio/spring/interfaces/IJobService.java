
package com.lhportfolio.spring.interfaces;

import java.util.List;
import com.lhportfolio.spring.model.Job;


public interface IJobService {
    public List<Job> verJob();
    public void crearJob (Job job);
    public void borrarJob (Long id);
    public Job buscarJob (Long id);
    public void editarJob (Job job);
    
}
