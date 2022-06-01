package com.pruebaJPA.demoJPA.controller;

import com.pruebaJPA.demoJPA.model.Persona;
import com.pruebaJPA.demoJPA.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class PersonaController {
    
    //se inyecta la interfaz porque ahi es donde agregamos o modificamos ante la aparicion de nuevos 
    //métodos, esto permite tener acceso a esos métodos aunque aun no se hayan realizado modificaciones
    // en la clase concreta de Service
    @Autowired
    private IPersonaService interfPersona;
    
    //devuelve la lista de personas
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return interfPersona.getPersonas();
    }
    
    //Endpoint que permite agregar a una nueva persona
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        interfPersona.savePersona(persona);
        return "Persona agregada correctamente";
    }
    
    //endpoint para dar de baja a una persona
    @DeleteMapping("/personas/borrar/{idPersona}")
    public String deletePersona(@PathVariable Long idPersona){
        interfPersona.deletePersona(idPersona);
        return "La persona ha sido eliminada, kaput";
    }
    
    //endpoint para modificar a una persona
    @PutMapping("/personas/editar/{idOriginal}")
    public Persona editPersona(@PathVariable Long idOriginal,
                               @RequestParam( required = false, name = "nombre") String nuevoNombre,
                               @RequestParam( required = false, name = "apellido") String nuevoApellido,
                               @RequestParam( required = false, name = "edad") Integer nuevaEdad){
    
       
        //se envia la id original para buscar a la persona a modificar + los nuevos datos
        interfPersona.editPersona(idOriginal, nuevoNombre, nuevoApellido, nuevaEdad);
        
        Persona persona = interfPersona.findPersona(idOriginal);
    
        return persona;
    }
    
}
