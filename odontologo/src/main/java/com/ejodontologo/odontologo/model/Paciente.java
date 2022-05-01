package com.ejodontologo.odontologo.model;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Setter
@Getter
public class Paciente {
    private long idPaciente;
    private String dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    public Paciente() {
    }

    public Paciente(long idPaciente, String dni, String nombre, String apellido, LocalDate fechaNacimiento) {
        this.idPaciente = idPaciente;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
