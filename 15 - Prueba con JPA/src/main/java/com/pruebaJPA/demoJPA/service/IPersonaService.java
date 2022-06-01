

package com.pruebaJPA.demoJPA.service;

import com.pruebaJPA.demoJPA.model.Persona;
import java.util.List;

/**
 *
 * @author Caro
 */
public interface IPersonaService {
    public List<Persona> getPersonas();
    public void savePersona(Persona persona);
    public void deletePersona(Long idPersona);
    public Persona findPersona(Long idPersona);
    public void editPersona(Long idOriginal, String nuevoNombre, String nuevoApellido, Integer nuevaEdad);

}
