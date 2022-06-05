

package com.alumno.cursos.service;

import com.alumno.cursos.model.Curso;
import com.alumno.cursos.repository.ICursoRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Caro
 */

@Service
public class CursoService implements ICursoService{

    @Autowired
    ICursoRepository cursoRepo;
    
    @Override
    public void guardarCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> traerCursos() {
        return cursoRepo.findAll();
    }

    
    @Override
    public void borrarCurso(Long idCurso) {
        cursoRepo.deleteById(idCurso);
    }

    @Override
    public Curso encontrarCurso(Long idCurso) {
          
        return cursoRepo.findById(idCurso).orElse(null);
    }
    
    @Override
    public void modificarCurso(Long idCurso, String nuevoNombre, String nuevaModalidad, String nuevaFechaFin) {
     
        Curso curso = this.encontrarCurso(idCurso);
        
        if(nuevoNombre !=null){
            curso.setNombre(nuevoNombre);
        }
        
        if(nuevaModalidad !=null){
            curso.setModalidad(nuevaModalidad);
        }
        
        if(nuevaFechaFin !=null){
           curso.setFecha_finalizacion(this.stringAFecha(nuevaFechaFin));
        }
        
        this.guardarCurso(curso);
        
    }

     //conversion de string a fecha
    private Date stringAFecha(String fechaAConvertir){
        Date dataFormateada = new Date();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            try { 
                 dataFormateada = formato.parse(fechaAConvertir);
            } catch (ParseException ex) {
                Logger.getLogger(CursoService.class.getName()).log(Level.SEVERE, null, ex);
            }
        return dataFormateada;
    }
}

 
