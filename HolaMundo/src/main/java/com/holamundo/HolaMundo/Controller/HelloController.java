package com.holamundo.HolaMundo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    
    @GetMapping("hello/{nombre}")
    public String sayHello(@PathVariable String nombre){
        return "Hola Mundo, hola " + nombre;
    }
    
    @GetMapping("hello/{name}/{age}/{profession}")
    public String sayHelloComplete( @PathVariable String name, 
                                    @PathVariable int age, 
                                    @PathVariable String profession) {
        return "Hola. Tu nombre es " + name + ", tenés " + age + " años y sos " + profession + ". Sabemos más de lo que pensas...";
    }
    
    @GetMapping("/bye")
    public String sayBye(){
        return "Chau, nos vemos";
    }
}
