
package com.lhportfolio.spring.service;

import com.lhportfolio.spring.interfaces.IJobService;
import com.lhportfolio.spring.model.Job;
import com.lhportfolio.spring.repository.JobRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService implements IJobService{

    @Autowired
    public JobRepository jobRepo;
     
    @Override
    public List<Job> verJob() {
    return jobRepo.findAll();
    }

    @Override
    public void crearJob(Job job) {
    jobRepo.save(job);
    }

    @Override
    public void borrarJob(Long id) {
    jobRepo.deleteById(id);
    }

    @Override
    public Job buscarJob(Long id) {
    return jobRepo.findById(id).orElse(null);
    }

    @Override
    public void editarJob(Job job) {
    jobRepo.save(job);
    }
    
}
