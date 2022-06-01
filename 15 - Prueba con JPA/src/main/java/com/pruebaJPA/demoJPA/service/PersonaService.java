

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
    public void editPersona(Long idOriginal, String nuevoNombre, String nuevoApellido, Integer nuevaEdad) {
        
        //sout hecho para probar por consola, no llegaba hasta aca porque estaba pasando mal los parametros
        //System.out.println(idOriginal + " " + idNueva  + " " + nuevoApellido + " " + nuevoNombre  + " " + nuevaEdad);
        Persona persona = this.findPersona(idOriginal);
        //persona.setId(idNueva); da error al intentar cambiar el id, no se modifica
        
        //verifico que se haya pasado este parametro para no guardar un valor null en la bbdd
        if(nuevoApellido != null){
           persona.setApellido(nuevoApellido);
       }
        
        if(nuevoNombre != null){
            persona.setNombre(nuevoNombre);
        }
            
        if(nuevaEdad != null){
            persona.setEdad(nuevaEdad);
        }
        
       this.savePersona(persona);
    }
}
