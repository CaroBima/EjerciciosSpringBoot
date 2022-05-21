

package com.inyeccionDependenciasAutowired.idAutowired.repository;

import com.inyeccionDependenciasAutowired.idAutowired.model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caro
 */
@Repository
public class PosteoRepository {
    public List<Posteo> traerTodos(){
        List<Posteo> listaPosteos = new ArrayList<Posteo>();
        listaPosteos.add(new Posteo(1L, "¿Cómo trabajar con springboot y no morir en el intento?", "Caro Bima"));
        listaPosteos.add(new Posteo(1L, "Milanesa: la receta perfecta", "Anibal Pereyra"));
        listaPosteos.add(new Posteo(1L, "Así reduje una cabeza: entrevista con un Jíbaro", "Paula Gomez"));
        
        return listaPosteos;
    }
}
