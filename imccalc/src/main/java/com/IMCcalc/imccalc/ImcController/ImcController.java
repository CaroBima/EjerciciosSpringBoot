/*
Api que al ingrar el IMC de una persona devuelva el estado de su peso
rangos:
1 a 18.5: peso insuficiente
18.6 a 24.9: peso normal
25 a 29.9: sobrepeso
de 30 en adelante: obesidad
usar @RequestParam
*/

package com.IMCcalc.imccalc.ImcController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */

@RestController
public class ImcController {
    
    //recibe el imc y devuelve si el peso es insuficiente, normal, sobrepeso u obesidad
    @GetMapping("/imc")
    public String imcRank(@RequestParam double valor){
        if(valor>0 && valor<18.6){
            return "Peso insuficiente (1 a 18.5): " + valor;
        }else if(valor>18.5 && valor<25){
                 return "Peso normal (18.6 a 24.9): " + valor;
             }else if(valor>=25 && valor<29.9){
                 return "Sobrepeso (25 a 29.9): " + valor;
             }else {
                 return "Obesidad (30 o +): " + valor;
             }
        
    }
    
    //se pasa por parametro altura en cm y peso 
    // formula de cálculo: IMC = Peso (kg) / altura (m)2
    @GetMapping("/calculoimc")
    public String imcCalc(@RequestParam double altura,
                          @RequestParam double peso){
    
    //si pasan la altura en cm la convierto a metro
    if(altura>99){
        altura = altura/100;
    }    
    
    double imc = peso / (altura*altura);   
      if(imc>0 && imc<18.6){
            return "Peso insuficiente (1 a 18.5): " + String.format("%.2f", imc);
        }else if(imc>18.5 && imc<25){
                 return "Peso normal (18.6 a 24.9): " + String.format("%.2f", imc);
             }else if(imc>=25 && imc<29.9){
                 return "Sobrepeso (25 a 29.9): " + String.format("%.2f", imc);
             }else {
                 return "Obesidad (30 o +): " + String.format("%.2f", imc);
             }
    }
}
