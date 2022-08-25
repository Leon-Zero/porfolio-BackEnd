
package com.lhportfolio.spring.repository;

import com.lhportfolio.spring.model.RedSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedSocialRepository extends JpaRepository <RedSocial, Long> {
    
}
