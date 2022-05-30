

package com.pruebaJPA.demoJPA.service;

import com.pruebaJPA.demoJPA.model.Persona;
import com.pruebaJPA.demoJPA.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Caro
 */
@Service
public class PersonaService implements IPersonaService {
    
    //inyeccion de dependencias entre PersonaService y PersonaRepository, esta ultima proporciona los datos
    @Autowired
    private IPersonaRepository persoRepository;

    
    //implementacion de los metodos de la clase IPersonaService:
    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona persona) {
        persoRepository.save(persona);
    }

    @Override
    public void deletePersona(Long idPersona) {
        persoRepository.deleteById(idPersona);
    }

    @Override
    public Persona findPersona(Long idPersona) {
        Persona persona = persoRepository.findById(idPersona).orElse(null);
        return persona;
    }

    //mètodo para editar los datos de una persona
    @Override
    public void editPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
       Persona persona = this.findPersona(idOriginal);
       persona.setId(idNueva);
       persona.setApellido(nuevoApellido);
       persona.setNombre(nuevoNombre);
       persona.setEdad(nuevaEdad);
       
       this.savePersona(persona);
    }
}
