

package com.mycompany.inyecciondependenciasconstructor;



public class ServicioLavado {
    private ServicioNormal lavNorm;
    private ServicioPremium lavPrem;

    //inyeccion de dependencias por constructo
    public ServicioLavado(ServicioNormal lavNorm, ServicioPremium lavPrem) {
        this.lavNorm = lavNorm;
        this.lavPrem = lavPrem;
    }
    
    //inyeccion de dependencias por setters
    public void setLavNorm(ServicioNormal lavNorm) {
        this.lavNorm = lavNorm;
    }

    public void setLavPrem(ServicioPremium lavPrem) {
        this.lavPrem = lavPrem;
    }
    
  
    
}
