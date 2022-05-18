/*
recibir dos numeros como parametros por la url y que devuelva la suma de ambos 
numeros por pantalla. Utilizar @PathVariable

*/

package com.mathteacher.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MathApplication {

	public static void main(String[] args) {
		SpringApplication.run(MathApplication.class, args);
	}

}
