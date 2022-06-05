

package com.alumno.cursos.repository;

import com.alumno.cursos.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caro
 */
@Repository
public interface ICursoRepository extends JpaRepository<Curso, Long> {
    
}
