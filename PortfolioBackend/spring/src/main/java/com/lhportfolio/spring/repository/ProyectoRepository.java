
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
}
