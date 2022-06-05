

package com.alumno.cursos.service;

import com.alumno.cursos.model.Tema;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface ITemaService {
    public void crearTema(Tema tema);
    public List<Tema> traerTemas();
    public void crearTemas();
    public void modificarTemas(Long idTema);
    public void borrarTema(Long idTema);
}
