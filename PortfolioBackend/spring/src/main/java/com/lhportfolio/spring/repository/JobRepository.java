
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository <Job, Long>{
    
}
