
package com.modelocapas.modeloCapas.repository;

import com.modelocapas.modeloCapas.model.Persona;
import java.util.List;

public interface IPersonaRepository {
    
    public void guardarPersona(Persona persona);
    public List traerListaPersonas();
    public void modificarPersona(Persona persona);
    
}
