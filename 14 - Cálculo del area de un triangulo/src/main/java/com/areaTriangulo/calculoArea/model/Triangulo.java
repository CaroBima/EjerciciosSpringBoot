

package com.areaTriangulo.calculoArea.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Triangulo {
    private double base, altura;

    //constructores
    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
}
