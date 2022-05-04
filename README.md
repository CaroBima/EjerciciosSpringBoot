# Curso de SpringBoot de Todo Code




# Ejercicios

| Nro  |                                                          Ejercicio                                                         |                                                                                          Solución                                                                                         |
|:----:|:--------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1  | Proyecto de prueba                                  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/Primer%20proyecto%20de%20prueba)                |
| 2 | Hola Mundo utilizando @PathVariable y @RequestParam. Agrego prueba de @RequestBody (con prueba en Postman) | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/HolaMundo)                |
| 3 | Recibe por parámetro el valor del imc y devuelve si esta dentro de un rango de peso insuficiente, normal, etc. Agregué la función que calcula el imc al pasar peso y altura y retorna el imc y en que categoría está  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/imccalc)                |
| 4 | Un turista norteamericano decidió recorrer en auto diferentes paises de América Latina. A la hora de cargar combustible, para su sorpresa, se encontró con que en la mayor parte de los países no se utiliza la medida "galones" sino que se utiliza "litros" a la hora de reabastecerse. Para poder solicitar correctamente la cantidad de litros que necesita, requiere el desarrollo de una API que, al enviarle la cantidad de galones, otorgue como respuesta el equivalente en litros. Para el desarrollo tener en cuenta que 1 galon es equivalente a 3.78541 litros.   | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/ejIntegrador)                |
| 5 | Un restaurante posee un total de 5 platos en su menú. Cada uno de ellos tiene un número de plato, nombre, precio y breve descripción. <br> a) El restaurante desea una palicación que permita que los clientes sean capaces de consultar los datos de los platos del menú a partir de proporcionar el número de plato. <br> Para ello, se necesita el desarrollo de una API que a partir de la recepción del número de plato en una solicitud GET, devuelva el plato correspondiente con todos sus datos. <br> Nota: tener en cuenta que, como aún no se está trabajando con base de datos, los platos deben ser almacenados en una collection, por ejemplo una Arraylist o una LinkedList.  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/restaurante)                |
| 6 | Un odontólogo cuenta con una lista de pacientes. De cada uno de ellos cuenta con los datos: id, dni, nombre, apellido y fecha de nacimiento. <br> a) El odontólogo necesita de una API que se capaz de brindarle el listado completo de sus pacientes. Para esto, desarrollar un end-point que permita devolver la lista completa de pacientes mediante el método GET. <br> b) Además, el odontólogo necesita saber sus pacientes que son menores de edad para contemplar que los mismos asistan a sus citas acompañados por un mayor. Para ello, necesita que la API posea un end-point que al realizar la solicitud GET, devuelva únicamente a los pacientes que sean menores de edad. Para realizar el cálculo de edad tener en cuenta la fecha de nacimiento de cada paciente y la fecha <<actual>> (día en que se esté haciendo la consulta). <br> Tips para fechas: <br> 1- Utilizar el tipo de dato LocalDate. <br> 2- Para obtener la fecha de hoy se utiliza el método LocalDate.now() <br> 3- Para calcular períodos entre dos fechas se utiliza la clase Period y el método between. Por ejemplo: Period.between (fecha_hoy, otra_fecha) <br> 4- Si utilizamos el método getYears en el objeto Period que tengamos, obtendremos la cantidad de años de diferencia.  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/odontologo)                |




