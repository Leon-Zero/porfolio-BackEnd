
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository <Idioma, Long>{
    
}
