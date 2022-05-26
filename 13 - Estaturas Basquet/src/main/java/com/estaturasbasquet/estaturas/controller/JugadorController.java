

package com.estaturasbasquet.estaturas.controller;

import com.estaturasbasquet.estaturas.model.Jugador;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
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
    
   //endpoint que permite agregar un nuevo jugador al arraylist 
   @PostMapping("/nuevo/jugador")
    public void guardarJugador(@RequestBody Jugador jugador){

        //Agrego el jugador en el array y lo recorro para mostrar por consola, para ver si funciona bien
        listaJugadores.add(jugador);
        
//        for (Jugador jug : listaJugadores){
//            System.out.println("jugador " + jug.getApellido());
//            System.out.println("jugador " + jug.getEstatura());
//        }
        
    }

    //endpoint para mostrar el promedio de estatura de los jugadores
    @GetMapping("/promedio")
    public double calcularPromedio(){
        int sumatoriaEstaturas = 0;
        
        
        //recorro el array y hago la sumatoria de estaturas
        for (Jugador jug : listaJugadores){
            sumatoriaEstaturas += jug.getEstatura();
            
        }
        
        return sumatoriaEstaturas / listaJugadores.size();
    }
}
