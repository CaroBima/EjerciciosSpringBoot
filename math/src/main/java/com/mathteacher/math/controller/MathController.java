

package com.mathteacher.math.controller;

import static java.lang.Integer.parseInt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Caro
 */
@RestController
public class MathController {
    
    @GetMapping("suma/{num1}/{num2}")
    public String sumParam (@PathVariable String num1, 
                            @PathVariable String num2){
        int result = parseInt(num1) + parseInt(num2);
        return "El resultado es: " + result;
    }
    
}
