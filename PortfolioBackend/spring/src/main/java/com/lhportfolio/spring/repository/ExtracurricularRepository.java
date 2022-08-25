
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.model.Extracurricular;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtracurricularRepository extends JpaRepository <Extracurricular, Long>{
    
}
