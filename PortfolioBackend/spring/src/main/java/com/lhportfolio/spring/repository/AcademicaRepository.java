
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.model.Academica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicaRepository extends JpaRepository <Academica, Long>{
    
}