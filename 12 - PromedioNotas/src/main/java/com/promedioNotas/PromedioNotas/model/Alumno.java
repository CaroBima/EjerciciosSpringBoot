
/*
Promedio de notas: Un alumno de secundaria desea poder contar con una API 
mediante la cual, al enviar las 3 notas de una materia, obtenga como respuesta 
el promedio de la misma. Para el pasaje de notas como parámetro tener en cuenta 
y utilizar la annotation @RequestParam

*/


package com.promedioNotas.PromedioNotas.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Alumno {
    private double nota1, nota2, nota3;

    public Alumno(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    
}
