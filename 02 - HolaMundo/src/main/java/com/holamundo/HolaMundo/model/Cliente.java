/* 
clase creada para probar @RequestBody
*/

package com.holamundo.HolaMundo.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Cliente {
    private long id;
    private String nombre;
    private String apellido;

    public Cliente(long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente() {
    }
  
    
    
}
