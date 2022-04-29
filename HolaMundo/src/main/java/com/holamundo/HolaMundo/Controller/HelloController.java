package com.holamundo.HolaMundo.Controller;

import com.holamundo.HolaMundo.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
    
    @GetMapping("/morehi")
    public String moreHi(@RequestParam String name,
                         @RequestParam int age,
                         @RequestParam String profession         
                         ){
        return "Otra vez te saludo " + name + ". Tenés " + age + " años y sos " + profession ;
    }
    
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cliente){
        System.out.println("Nombre y apellido del cliente: " + cliente.getNombre() + " " + cliente.getApellido() );
    }
    
    @GetMapping ("/cliente/traer")
    @ResponseBody
    public List<Cliente> traerClientes(){
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        
        Cliente cliente1 = new Cliente ();
        cliente1.setApellido("Perez");
        cliente1.setNombre("Paula");
        cliente1.setId(1L);
        
        Cliente cliente2 = new Cliente ();
        cliente2.setApellido("Miguelez");
        cliente2.setNombre("Laura");
        cliente2.setId(1L);

        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        return listaClientes;
    }
    
    @GetMapping ("/pruebaresponse")
    ResponseEntity<String> traerRespuesta(){
        return new ResponseEntity<>("Mensaje devuelto con Response Entity", HttpStatus.OK);
    }
}
