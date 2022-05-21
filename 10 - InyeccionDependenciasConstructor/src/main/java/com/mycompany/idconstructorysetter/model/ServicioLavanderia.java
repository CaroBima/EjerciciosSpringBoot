package com.mycompany.idconstructorysetter.model;

import com.mycompany.idconstructorysetter.model.LavadoNormal;



public class ServicioLavanderia {
    private LavadoNormal lavNorm;
    private LavadoPremium lavPrem;

    //inyeccion de dependencias por constructo
    public ServicioLavanderia(LavadoNormal lavNorm, LavadoPremium lavPrem) {
        this.lavNorm = lavNorm;
        this.lavPrem = lavPrem;
    }

    //inyeccion de dependencias por setters
    public void setLavNorm(LavadoNormal lavNorm) {
        this.lavNorm = lavNorm;
    }

    public void setLavPrem(LavadoPremium lavPrem) {
        this.lavPrem = lavPrem;
    }



}