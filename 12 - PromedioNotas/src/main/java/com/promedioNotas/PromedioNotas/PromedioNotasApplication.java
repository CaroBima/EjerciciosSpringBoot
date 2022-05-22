/*
Promedio de notas: Un alumno de secundaria desea poder contar con una API 
mediante la cual, al enviar las 3 notas de una materia, obtenga como respuesta 
el promedio de la misma. Para el pasaje de notas como parámetro tener en cuenta 
y utilizar la annotation @RequestParam

*/

package com.promedioNotas.PromedioNotas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PromedioNotasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PromedioNotasApplication.class, args);
	}

}
