

package com.alumno.cursos.model;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Curso {
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;
    private Tema listadeTemas;

    
    //constructores:
    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, String fecha_finalizacion, Tema listadeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listadeTemas = listadeTemas;
    }
    
    
}
