
package com.alumno.cursos.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
@Entity
public class Curso implements Serializable {
    
    @Id
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;
    
    @OneToMany
    private List<Tema> listadeTemas;

    
    //constructores:
    public Curso() {
    }

    public Curso(Long id_curso, String nombre, String modalidad, String fecha_finalizacion, List<Tema> listadeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_finalizacion;
        this.listadeTemas = listadeTemas;
    }

 
}
