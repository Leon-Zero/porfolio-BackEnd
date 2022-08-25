
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramacionRepository extends JpaRepository<Programacion, Long>{
    
}
