

package com.estaturasbasquet.estaturas.controller;

import com.estaturasbasquet.estaturas.model.Jugador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class JugadorController {
    
    @Autowired
    List<Jugador> listaJugadores;
    
    @Autowired
    Jugador jugador;
    
    @PostMapping("/agregajugador")
    public void guardarJugador( @RequestParam Long id,
                                @RequestParam String dni,
                                @RequestParam String nombre,
                                @RequestParam String apellido,
                                @RequestParam int edad,
                                @RequestParam double peso,
                                @RequestParam int estatura){
        jugador.setId(id);
        jugador.setDni(dni);
        jugador.setNombre(nombre);
        jugador.setApellido(apellido);
        jugador.setEdad(edad);
        jugador.setPeso(peso);
        jugador.setEstatura(estatura);
        
        listaJugadores.add(jugador);
        
    }
}
