
package com.modelocapas.modeloCapas.repository;

import com.modelocapas.modeloCapas.model.Persona;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class PersonaRepository implements IPersonaRepository {

    @Override
    public void guardarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List traerListaPersonas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //metodos para llamar a la base de datos
}
