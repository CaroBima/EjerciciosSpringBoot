

package com.promedioNotas.PromedioNotas.service;

import org.springframework.stereotype.Service;


@Service
public class AlumnoService implements IAlumnoService {

     @Override
    public double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3)/3;
    }
    
}
