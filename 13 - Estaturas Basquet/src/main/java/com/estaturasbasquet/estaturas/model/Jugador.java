
/*
Estaturas en Básquet: Un director técnico de un equipo de básquet desea poder 
contar con una API que, al enviar los datos de 5 de sus jugadores en el body de 
una solicitud http POST, los mismos sean dados de alta en una base de datos lógica 
representada por una lista de topo ArrayList y que, al mismo tiempo, luego del 
alta correspondiente, se pueda obtener inmediatamente como respuesta el promedio 
de estatura de todos sus jugadores ingresados.
Los datos que se ingresar para cada jugador son los siguientes: id, dni, nombre, 
apellido, edad, peso y estatura.
Tener en cuenta para la realización de este ejercicio la manipulación/creación 
de archivos JSON, el uso de Postman como herramienta para generar la solicitud 
POST, la annotation @RequestBody y el manejo de ArrayLists.
*/
package com.estaturasbasquet.estaturas.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Jugador {
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private double peso;
    private int estatura;

    //constructores
    public Jugador() {
    }
    
    public Jugador(Long id, String dni, String nombre, String apellido, int edad, double peso, int estatura) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    
    
}
