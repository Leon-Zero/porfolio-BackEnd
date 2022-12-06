
package com.lhportfolio.spring.controller;

import com.lhportfolio.spring.interfaces.IJobService;
import com.lhportfolio.spring.entity.Job;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "https://portfolio-lh.web.app")
@CrossOrigin(origins = "http://localhost:4200")
public class JobController {
    
       //metodos clase Job
    
     @Autowired
    private IJobService jobServ;
     
    @GetMapping("/jobs")
    @ResponseBody
    public List<Job>verJob(){
       return jobServ.verJob();
    } 
    
    @PreAuthorize("hasRole('ADMIN')") 
    @PostMapping("/jobs")
    public void agregarJob(@RequestBody Job job){
        jobServ.crearJob(job);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/jobs/{id}")
    @ResponseBody
    public Job selectJobs(@PathVariable Long id){
       return jobServ.buscarJob(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/jobs/{id}")
    public void borrarJob(@PathVariable Long id){
        jobServ.borrarJob(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/jobs/{id}")
    public void editarJob(@PathVariable Long id, @RequestBody Job job){
        jobServ.editarJob(job);
    }
}
