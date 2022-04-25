/*
Un turista norteamericano decidió recorrer en auto diferentes paises de América Latina.
A la hora de cargar combustible, para su sorpresa, se encontró con que en la mayor
parte de los países no se utiliza la medida "galones" sino que se utiliza "litros" a
la hora de reabastecerse. 
Para poder solicitar correctamente la cantidad de litros que necesita, requiere el
desarrollo de una API que, al enviarle la cantidad de galones, otorgue como respuesta
el equivalente en litros. 
Para el desarrollo tener en cuenta que 1 galon es equivalente a 3.78541 litros. 
*/

package com.ejerciciointegradoruno.ejIntegrador;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjIntegradorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjIntegradorApplication.class, args);
	}

}
