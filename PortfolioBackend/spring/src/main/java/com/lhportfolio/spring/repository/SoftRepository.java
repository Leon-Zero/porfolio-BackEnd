
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.entity.Soft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftRepository extends JpaRepository<Soft, Long> {
    
}
