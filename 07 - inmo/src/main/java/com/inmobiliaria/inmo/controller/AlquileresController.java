package com.inmobiliaria.inmo.controller;

import com.inmobiliaria.inmo.model.Inquilino;
import com.inmobiliaria.inmo.model.Propiedad;
import com.inmobiliaria.inmo.model.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class AlquileresController {
    @GetMapping("/propiedad/{id}")
    @ResponseBody
    public PropiedadDTO devolverPropiedad( @PathVariable Long id){
        Inquilino inquilino = new Inquilino(1L, "12334567", "Miguel", "Moreira", "Gaucho");
        Propiedad propiedad = new Propiedad(23L, "Departamento", "Fake adress 123", 250.0, 45000.00);
        
        PropiedadDTO propiedadDto = new PropiedadDTO();
        
        propiedadDto.setIdPropiedad(propiedad.getIdPropiedad());
        propiedadDto.setTipo(propiedad.getTipoPropiedad());
        propiedadDto.setDireccion(propiedad.getDireccion());
        propiedadDto.setValorAlquiler(propiedad.getValorAlquiler());
        propiedadDto.setNombreInquilino(inquilino.getNombre());
        propiedadDto.setApellidoInquilino(inquilino.getApellido());
        
        return propiedadDto;
    
    }
}
