
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Datos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatosRepository extends JpaRepository <Datos, Long>{
    
}