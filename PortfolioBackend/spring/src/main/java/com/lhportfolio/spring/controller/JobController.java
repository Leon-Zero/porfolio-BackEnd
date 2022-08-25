
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IJobService;
import com.lhportfolio.spring.entity.Job;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
    
       //metodos clase Job
    
     @Autowired
    private IJobService jobServ;
       
    @PostMapping ("/jobs")
    public void agregarJob(@RequestBody Job job){
        jobServ.crearJob(job);
    }
    
    @GetMapping ("/jobs")
    @ResponseBody
    public List<Job> verJob(){
       return jobServ.verJob();
    }
    
    @GetMapping ("/jobs/{id}")
    @ResponseBody
    public Job selectJobs( @PathVariable Long id){
       return jobServ.buscarJob(id);
    }
    
    @DeleteMapping ("/jobs/{id}")
    public void borrarJob (@PathVariable Long id){
        jobServ.borrarJob(id);
    }
    @PutMapping ("/jobs/{id}")
    public void editarJob (@RequestBody Job job, Long id){
        jobServ.editarJob(job);
    }

    
}
