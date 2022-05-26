/*
Área del triángulo: Realizar una API que permita obtener como response a una 
solicitud GET el área de un triángulo. Se recuerda que la fórmula para calcular 
el área de un triángulo es (base * altura)/2.
Se debe permitir al usuario enviar como parámetro de la solicitud la base y la 
altura, mientras que la API debe calcular el área y responder el resultado.
Para este ejercicio sentite con total libertad de utilizar la forma de pasaje 
de parámetros con la que más cómodo te sientas
*/

package com.areaTriangulo.calculoArea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculoAreaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculoAreaApplication.class, args);
	}

}
