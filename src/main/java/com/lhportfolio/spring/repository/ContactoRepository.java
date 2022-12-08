
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository <Contacto, Long>{
    
}
