

package com.inyeccionDependenciasAutowired.idAutowired.controller;

import com.inyeccionDependenciasAutowired.idAutowired.model.Posteo;
import com.inyeccionDependenciasAutowired.idAutowired.repository.PosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class PosteoController {
    @Autowired
    PosteoRepository repository;
    
    @GetMapping ("/posteos")
    public List<Posteo> traerTodos(){
        return repository.traerTodos();
    }
}
