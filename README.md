# Curso de SpringBoot de Todo Code




# Ejercicios

| Nro  |                                                          Ejercicio                                                         |                                                                                          Solución                                                                                         |
|:----:|:--------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| 1  | Proyecto de prueba                                  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/01%20-%20Primer%20proyecto%20de%20prueba)                |
| 2 | Hola Mundo utilizando @PathVariable y @RequestParam. Agrego prueba de @RequestBody (con prueba en Postman) | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/02%20-%20HolaMundo)                |
| 3 | Un profesor de matemáticas de primaria desea la realización de una API mediante la cual a partir de la recepción de dos números como parámetros de una URL, la misma devuelva la suma de ambos números por pantalla. Utilizar para este ejercicio la annotation @PathVariable  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/03%20-%20Profesor%20Matem%C3%A1ticas)    |
| 4 | Recibe por parámetro el valor del imc y devuelve si esta dentro de un rango de peso insuficiente, normal, etc. Agregué la función que calcula el imc al pasar peso y altura y retorna el imc y en que categoría está  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/04%20-%20imccalc)                |
| 5 | Un turista norteamericano decidió recorrer en auto diferentes paises de América Latina. A la hora de cargar combustible, para su sorpresa, se encontró con que en la mayor parte de los países no se utiliza la medida "galones" sino que se utiliza "litros" a la hora de reabastecerse. Para poder solicitar correctamente la cantidad de litros que necesita, requiere el desarrollo de una API que, al enviarle la cantidad de galones, otorgue como respuesta el equivalente en litros. Para el desarrollo tener en cuenta que 1 galon es equivalente a 3.78541 litros.   | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/05%20-%20ejIntegrador%20-%20Turista)                |
| 6 | Un restaurante posee un total de 5 platos en su menú. Cada uno de ellos tiene un número de plato, nombre, precio y breve descripción. <br> a) El restaurante desea una palicación que permita que los clientes sean capaces de consultar los datos de los platos del menú a partir de proporcionar el número de plato. <br> Para ello, se necesita el desarrollo de una API que a partir de la recepción del número de plato en una solicitud GET, devuelva el plato correspondiente con todos sus datos. <br> Nota: tener en cuenta que, como aún no se está trabajando con base de datos, los platos deben ser almacenados en una collection, por ejemplo una Arraylist o una LinkedList.  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/06%20-%20restaurante)                |
| 7 | Un odontólogo cuenta con una lista de pacientes. De cada uno de ellos cuenta con los datos: id, dni, nombre, apellido y fecha de nacimiento. <br> a) El odontólogo necesita de una API que se capaz de brindarle el listado completo de sus pacientes. Para esto, desarrollar un end-point que permita devolver la lista completa de pacientes mediante el método GET. <br> b) Además, el odontólogo necesita saber sus pacientes que son menores de edad para contemplar que los mismos asistan a sus citas acompañados por un mayor. Para ello, necesita que la API posea un end-point que al realizar la solicitud GET, devuelva únicamente a los pacientes que sean menores de edad. Para realizar el cálculo de edad tener en cuenta la fecha de nacimiento de cada paciente y la fecha <<actual>> (día en que se esté haciendo la consulta). <br> Tips para fechas: <br> 1- Utilizar el tipo de dato LocalDate. <br> 2- Para obtener la fecha de hoy se utiliza el método LocalDate.now() <br> 3- Para calcular períodos entre dos fechas se utiliza la clase Period y el método between. Por ejemplo: Period.between (fecha_hoy, otra_fecha) <br> 4- Si utilizamos el método getYears en el objeto Period que tengamos, obtendremos la cantidad de años de diferencia.  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/07%20-%20odontologo)                |
| 8 | Inmobiliaria: uso de DTO para recuperar datos de una clase inmueble y otra inquilino  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/08%20-%20inmo)    |
| 9 | Modelo de capas  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/09%20-%20modeloCapas)    |
| 10 | Ejemplo básico de inyección de dependencias con constructor y con setters  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/10%20-%20InyeccionDependenciasConstructor)    |
| 11 | Ejemplo básico de uso de @Autowired. Responde a una peticion pasada por get.  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/11%20-%20Autowired)    |
| 12 | Promedio de notas: Un alumno de secundaria desea poder contar con una API mediante la cual, al enviar las 3 notas de una materia, obtenga como respuesta el promedio de la misma. Para el pasaje de notas como parámetro tener en cuenta y utilizar la annotation @RequestParam  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/12%20-%20PromedioNotas)    |  
| 13 | Estaturas en Básquet: Un director técnico de un equipo de básquet desea poder contar con una API que, al enviar los datos de 5 de sus jugadores en el body de una solicitud http POST, los mismos sean dados de alta en una base de datos lógica representada por una lista de topo ArrayList y que, al mismo tiempo, luego del alta correspondiente, se pueda obtener inmediatamente como respuesta el promedio de estatura de todos sus jugadores ingresados. <br> Los datos que se ingresar para cada jugador son los siguientes: id, dni, nombre, apellido, edad, peso y estatura. <br> Tener en cuenta para la realización de este ejercicio la manipulación/creación de archivos JSON, el uso de Postman como herramienta para generar la solicitud POST, la annotation @RequestBody y el manejo de ArrayLists.  | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/13%20-%20Estaturas%20Basquet)    |
| 14 | Área del triángulo: Realizar una API que permita obtener como response a una solicitud GET el área de un triángulo. Se recuerda que la fórmula para calcular el área de un triángulo es (base * altura)/2. <br> Se debe permitir al usuario enviar como parámetro de la solicitud la base y la altura, mientras que la API debe calcular el área y responder el resultado. <br> Para este ejercicio sentite con total libertad de utilizar la forma de pasaje de parámetros con la que más cómodo te sientas | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/14%20-%20C%C3%A1lculo%20del%20area%20de%20un%20triangulo)    | 
| 15 | Ejercicio de prueba para aplicar JPA + Hibernate | [Solución](https://github.com/CaroBima/CursoSpringBoot/tree/master/15%20-%20Prueba%20con%20JPA)    | 

