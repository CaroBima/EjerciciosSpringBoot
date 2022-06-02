

package com.alumno.cursos.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Tema {
    private Long id_tema;
    private String nombre;
    private String descripcion;

    
    //constructores:
    public Tema() {
    }

    public Tema(Long id_tema, String nombre, String descripcion) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
}
