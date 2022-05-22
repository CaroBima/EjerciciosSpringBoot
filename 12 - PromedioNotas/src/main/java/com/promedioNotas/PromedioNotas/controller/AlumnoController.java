

package com.promedioNotas.PromedioNotas.controller;


import com.promedioNotas.PromedioNotas.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlumnoController {
    
    @Autowired
    IAlumnoService repository;
    
    @GetMapping ("/promedio")
    public double promedio(@RequestParam double nota1,
                           @RequestParam double nota2,
                           @RequestParam double nota3){
        
        return repository.calcularPromedio(nota1, nota2, nota3);
        
    }
}
