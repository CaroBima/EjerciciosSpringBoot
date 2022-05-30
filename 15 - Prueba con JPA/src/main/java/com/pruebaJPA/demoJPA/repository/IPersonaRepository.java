

package com.pruebaJPA.demoJPA.repository;

import com.pruebaJPA.demoJPA.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caro
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
