

package com.estaturasbasquet.estaturas.controller;

import com.estaturasbasquet.estaturas.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class JugadorController {
    
   List<Jugador> listaJugadores = new ArrayList(); 
    
    @PostMapping("/nuevo/jugador")
    public void guardarJugador(@RequestBody Jugador jugador){
        
        
        
        System.out.println("antes del array");       
        listaJugadores.add(jugador);
        
        System.out.println("antes del for");       
        for (Jugador jug : listaJugadores){
            System.out.println("jugador " + jug.getApellido());
        }
        
    }
}
