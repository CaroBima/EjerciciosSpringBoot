/*
Un turista norteamericano decidió recorrer en auto diferentes paises de América Latina.
A la hora de cargar combustible, para su sorpresa, se encontró con que en la mayor
parte de los países no se utiliza la medida "galones" sino que se utiliza "litros" a
la hora de reabastecerse. 
Para poder solicitar correctamente la cantidad de litros que necesita, requiere el
desarrollo de una API que, al enviarle la cantidad de galones, otorgue como respuesta
el equivalente en litros. 
Para el desarrollo tener en cuenta que 1 galon es equivalente a 3.78541 litros. 
*/


package com.ejerciciointegradoruno.ejIntegrador.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */

@RestController
public class ConversorController {
    
    @GetMapping("/conversor")
    public String conversorgalones(@RequestParam double galones){
        double litros = galones * 3.78541;
        return galones + " galones equivalen a " + litros + " litros.";
    }
}
