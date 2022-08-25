
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository <Idioma, Long>{
    
}
