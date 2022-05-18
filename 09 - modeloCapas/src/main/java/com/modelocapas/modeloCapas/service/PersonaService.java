//métodos de logica del negocio
    
package com.modelocapas.modeloCapas.service;

import com.modelocapas.modeloCapas.model.Persona;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    
    @Override
    public void crearPersona(Persona persona) {
        //lògica de creacion
        System.out.println("Persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //lógica que devuelve la lista de personas
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
}
