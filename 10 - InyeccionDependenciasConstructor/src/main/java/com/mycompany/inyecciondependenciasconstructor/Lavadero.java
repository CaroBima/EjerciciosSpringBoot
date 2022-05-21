

package com.mycompany.inyecciondependenciasconstructor;



public class Lavadero {
    private LavadoNormal lavNorm;
    private LavadoPremium lavPrem;

    //inyeccion de dependencias por constructo
    public Lavadero(LavadoNormal lavNorm, LavadoPremium lavPrem) {
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
