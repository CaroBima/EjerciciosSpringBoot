/*
Un odontólogo cuenta con una lista de pacientes. De cada uno de ellos cuenta con 
los datos: id, dni, nombre, apellido y fecha de ncimiento.
a) El odontólogo necesita de una API que se capaz de brindarle el listado completo
de sus pacientes. Para esto, desarrollar un end-point que permita devolver la lista
completa de pacientes mediante el método GET.
b) Además, el odontólogo necesita saber sus pacientes que son menores de edad para
contemplar que los mismos asistan a sus citas acompañados por un mayor. Para ello,
necesita que la API posea un end-point que al realizar la solicitud GET, devuelva
únicamente a los pacientes que sean menores de edad. Para realizar el cálculo de
edad tener en cuenta la fecha de nacimiento de cada paciente y la fecha <<actual>>
(día en que se esté haciendo la consulta).

Tips para fechas
1- Utilizar el tipo de dato LocalDate.
2- Para obtener la fecha de hoy se utiliza el método LocalDate.now()
3- Para calcular períodos entre dos fechas se utiliza la clase Period y el método
between. Por ejemplo: Period.between (fecha_hoy, otra_fecha)
4- Si utilizamos el método getYears en el objeto Period que tengamos, obtendremos
la cantidad de años de diferencia.
*/

package com.ejodontologo.odontologo.controller;

import com.ejodontologo.odontologo.model.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class OdontologiaController {
    
    /*
    a) El odontólogo necesita de una API que se capaz de brindarle el listado completo
de sus pacientes. Para esto, desarrollar un end-point que permita devolver la lista
completa de pacientes mediante el método GET.
    */
    @GetMapping("/pacientes")
    @ResponseBody
    public List<Paciente> devolverPacientes(){
        List<Paciente> listaPacientes = new ArrayList<Paciente>();
    
        listaPacientes.add( new Paciente(1, "33456789", "Marcela", "Perez", LocalDate.of(2000,04,03)));
        listaPacientes.add( new Paciente(2, "28938654", "Paula", "Dávila", LocalDate.of(1979,01,02)));
        listaPacientes.add( new Paciente(3, "9658743", "Pedro", "Coral", LocalDate.of(1978,11,12)));
        listaPacientes.add( new Paciente(4, "40125000", "Daniela", "Romero", LocalDate.of(2015,07,05)));
        
        return listaPacientes; 
    }
    
    
    /*
    b) Además, el odontólogo necesita saber sus pacientes que son menores de edad para
contemplar que los mismos asistan a sus citas acompañados por un mayor. Para ello,
necesita que la API posea un end-point que al realizar la solicitud GET, devuelva
únicamente a los pacientes que sean menores de edad. Para realizar el cálculo de
edad tener en cuenta la fecha de nacimiento de cada paciente y la fecha <<actual>>
(día en que se esté haciendo la consulta).
*/
    
}
