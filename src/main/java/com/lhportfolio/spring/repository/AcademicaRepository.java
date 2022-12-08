
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Academica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicaRepository extends JpaRepository <Academica, Long>{
    
}