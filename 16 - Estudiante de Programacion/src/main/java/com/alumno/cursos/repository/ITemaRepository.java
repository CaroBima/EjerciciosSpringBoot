

package com.alumno.cursos.repository;

import com.alumno.cursos.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caro
 */
@Repository
public interface ITemaRepository extends JpaRepository<Tema, Long> {
    
}
