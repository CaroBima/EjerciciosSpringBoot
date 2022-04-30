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

package com.ejrestaurante.restaurante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestauranteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

}
