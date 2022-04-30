/*
Un restaurante posee un total de 5 platos en su menú. Cada uno de ellos tiene un
número de plato, nombre, precio y breve descripción. 
a) El restaurante desea una palicación que permita que los clientes sean capaces de consultar
los datos de los platos del menú a partir de proporcionar el número de plato. 
Para ello, se necesita el desarrollo de una API que a partir de la recepción del 
número de plato en una solicitud GET, devuelva el plato correspondiente con todos
sus datos.
Nota: tener en cuenta que, como aún no se está trabajando con base de datos, los platos
deben ser almacenados en una collection, por ejemplo una Arraylist o una LinkedList.

*/

package com.ejrestaurante.restaurante.controller;

import com.ejrestaurante.restaurante.model.Plato;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class RestauranteController {
    
    @GetMapping("/plato")
    @ResponseBody
    public Plato mostrarPlato(@RequestParam long idPlato){
        List<Plato> listaPlatos = new ArrayList<Plato>();
        Plato platoconsultado = new Plato();
        
        //cargo los datos en el ArrayList
        listaPlatos.add( new Plato(1, "Milanesa", "Carne empanada con finas hierbas y pan de ayer", 545.25));
        listaPlatos.add( new Plato(2, "Papas fritas", "Papas peladas fritas en aceites esenciales y con fina lluvia de sal", 300.00));
        listaPlatos.add( new Plato(3, "Empanadas", "Carne picada a cuchillo bien afilado envuelta en masa", 100.00));
        listaPlatos.add( new Plato(4, "Bife de chorizo", "Asau", 950.99));
        listaPlatos.add( new Plato(5, "Asau", "Costillas, chinchulines, matambre y no sigo describiendo porque me da hambre", 1543.24));
        
        //Recorro el arrayList buscando el numero de opcion pasado desde el front
        for(Plato plato : listaPlatos){
            if(plato.getIdPlato() == idPlato){
                platoconsultado = plato;
            } 
               
        }
            
        return platoconsultado;
    }
    
    
    
     
}
