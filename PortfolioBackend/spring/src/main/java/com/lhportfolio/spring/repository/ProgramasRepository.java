
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.model.Programas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramasRepository extends JpaRepository <Programas, Long> {
    
}
