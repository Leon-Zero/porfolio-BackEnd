
package com.lhportfolio.spring.security.repository;

import com.lhportfolio.spring.security.entity.Rol;
import com.lhportfolio.spring.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
