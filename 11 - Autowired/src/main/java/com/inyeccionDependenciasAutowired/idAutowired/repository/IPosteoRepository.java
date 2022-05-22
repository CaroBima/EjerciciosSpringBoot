

package com.inyeccionDependenciasAutowired.idAutowired.repository;

import com.inyeccionDependenciasAutowired.idAutowired.model.Posteo;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IPosteoRepository {
    public List<Posteo> traerTodos();
}
