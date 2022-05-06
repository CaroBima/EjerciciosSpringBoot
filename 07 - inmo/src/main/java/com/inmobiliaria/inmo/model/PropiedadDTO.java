

package com.inmobiliaria.inmo.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class PropiedadDTO implements Serializable{
    private long idPropiedad;
    private String tipo;
    private String direccion;
    private Double valorAlquiler;
    private String nombreInquilino;
    private String apellidoInquilino;

    public PropiedadDTO() {
    }

    public PropiedadDTO(long idPropiedad, String tipo, String direccion, Double valorAlquiler, String nombreInquilino, String apellidoInquilino) {
        this.idPropiedad = idPropiedad;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valorAlquiler = valorAlquiler;
        this.nombreInquilino = nombreInquilino;
        this.apellidoInquilino = apellidoInquilino;
    }
    
    
}
