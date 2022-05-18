

package com.modelocapas.modeloCapas.service;

import com.modelocapas.modeloCapas.model.Persona;
import java.util.List;



public interface IPersonaService {
    public void crearPersona(Persona persona);
    public List<Persona> traerPersonas();
}
