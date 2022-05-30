

package com.pruebaJPA.demoJPA.service;

import com.pruebaJPA.demoJPA.model.Persona;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IPersonaService {
    public List<Persona> verGeneros();
    public void agregarGenero(Persona idPersona);
    public boolean borrarGenero(int idPersona);
    public Persona buscarGenero(int idPersona);

}
