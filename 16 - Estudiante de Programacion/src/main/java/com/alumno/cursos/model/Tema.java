

package com.alumno.cursos.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
@Entity
public class Tema {
    @Id
    private Long id_tema;
    private String nombre;
    private String descripcion;

    @ManyToOne
    @JoinColumn(name="id_curso")
    private Curso id_curso;
    
    //constructores:
    public Tema() {
    }

    public Tema(Long id_tema, String nombre, String descripcion, Curso id_curso) {
        this.id_tema = id_tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.id_curso = id_curso;
    }
}
