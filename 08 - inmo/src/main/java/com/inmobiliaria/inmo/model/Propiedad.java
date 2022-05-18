

package com.inmobiliaria.inmo.model;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@Getter
@Setter
public class Propiedad {
   private Long idPropiedad;
   private String tipoPropiedad;
   private String direccion;
   private Double metrosCuadrados;
   private Double valorAlquiler;

    public Propiedad() {
    }

    public Propiedad(Long idPropiedad, String tipoPropiedad, String direccion, Double metrosCuadrados, Double valorAlquiler) {
        this.idPropiedad = idPropiedad;
        this.tipoPropiedad = tipoPropiedad;
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.valorAlquiler = valorAlquiler;
    }
   
   
}
