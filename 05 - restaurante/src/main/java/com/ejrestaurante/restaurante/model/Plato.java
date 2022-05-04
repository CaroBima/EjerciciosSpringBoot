
package com.ejrestaurante.restaurante.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Plato {
    private long idPlato;
    private String nombrePlato;
    private String descripción;
    private double precio;

    public Plato() {
    }

    public Plato(long idPlato, String nombrePlato, String descripción, double precio) {
        this.idPlato = idPlato;
        this.nombrePlato = nombrePlato;
        this.descripción = descripción;
        this.precio = precio;
    }
    
    
    
}
