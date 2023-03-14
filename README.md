# EJERCICIOS--JAVA

En este repositorio encontrarás ejemplos de implementación de conceptos fundamentales de programación orientada a objetos como clases abstractas, patrones de diseño (Factory, Singleton y Composite), captura de errores mediante el uso de excepciones, definición de interfaces, uso de constantes, manejo de colecciones y diferentes instanciaciones de objetos.

Los ejemplos están diseñados para mostrar cómo se pueden aplicar estos conceptos en la práctica y cómo pueden ayudar a mejorar la calidad y eficiencia del código. Además, cada ejemplo incluye comentarios y explicaciones detalladas para facilitar la comprensión de los conceptos.

Este repositorio es útil tanto para principiantes que desean aprender sobre programación orientada a objetos como para desarrolladores experimentados que buscan mejorar su conocimiento y habilidades en este ámbito.



Ejercicio 1 (Empresa-Empleados-relacionesDeTrabajo):

Modelar y programar en Java la implementación del Patrón de Diseño Factory.
Enunciado

Dada la siguiente familia de clases, se te encomienda el desafío de optimizar el diseño, teniendo en cuenta que necesitamos construir objetos de estas clases a partir de diferentes parámetros establecidos. 

clases=
Empresa:
- razonSocial: String
+ calcularSueldoTotal(int):Double

Empleado:
- nombre:String
- apellido:String
- legajo: int
+ abstratCalcularSueldo(dias:int):Double

EmpleadoRelacionDependencia:
+ sueldoMensual:double
+ calcularSueldo(dias:int):Double

EmpleadoContratado:
- importePorHora:Double
- retencionImpuesto:Double
+ calcularSueldo(dias:int):Double

Si recibimos como parámetro
“EMP-RD” deberás poder construir un objeto de la clase EmpleadoRelacionDependencia con un sueldo de 1000 dolares y si el parámetro es “EMP-PH” deberás poder construir un objeto de la clase EmpleadoContratado con un importe por hora de 7 dólares y una retención impuesto de 14%.

Basado en el enunciado realizar:

a) Modificar el diagrama de clases con la implementación del Patrón Factory
b) La programación del método calcularSueldo que devuelva (no muestre por consola) el sueldo para la cantidad de días que dicho método reciba como parámetro. Tener en cuanta que en el caso de los empleados en relación de dependencia se deberá calcular el proporcional a los días trabajados.

Consideraciones: Considerar que los meses tienen 30 días y trabajan 8 hs diarias.




























Ejercicio3 (Contrato-Personas-Salarios):

Objetivo
Realizar el diagrama UML y programar en Java el siguiente enunciado. Enviar los archivos vía el formulario que proporcionará el docente.

Enunciado

Un comercio necesita construir un sistema para administrar los contratos de trabajo que tienen sus empleados.
Un contrato solo puede corresponder a una sola persona y los datos que se necesitan de esta son: el nombre, el apellido, DNI y su edad. Utilizar un constructor que permita asignar todos los atributos al momento de necesitar crear un objeto.
Los contratos además de tener asociado a una persona tienen la cantidad de meses de  duración, fecha en la que la persona inició la actividad y si fue sellado por el ministerio de trabajo. 
Existen dos variantes de contratos: con salario por horas y mensuales. Ambos tienen todas las características que nombramos antes pero los por horas además tienen la cantidad de horas contratadas por mes y el valor de la hora. Los contratos mensuales por otro lado tienen salario mensual, horas totales y el cargo: “empleado”, “supervisor”, “jefe”.

El sistema debe contar con las siguientes funcionalidades:
De cualquier tipo de contrato debemos poder saber si se puede incorporar al trabajo. Para poder incorporarse al trabajo debe estar sellado en el ministerio de trabajo..
En el caso de los contratos por hora debe ser posible compararlos. Un contrato por horas  es mayor a otro de acuerdo a la cantidad de horas contratadas.
Es importante contar con alguna funcionalidad en los contratos mensuales para saber si es un cargo de “jefe”..
































Ejercicio 4 (Almacen-Productos-Medidas):
Objetivo:
Modelar y programar en Java la implementación del Patrón de Diseño Factory.
Enunciado
Dada la siguiente familia de clases, se te encomienda el desafío de optimizar el diseño, teniendo en cuenta que necesitamos construir objetos de estas clases a partir de diferentes parámetros recibidos. 

Clases=

Almacen:
+ calcularEspacioNecesario():double

Producto:
- Peso: Double
+ abstractCalcularEspacio():Double

Caja:
- longitud : Double
- ancho: Double
- altura : Double
+ calcularEspacio():Double

Pelota:
- radio: Double
+ calcularEspacio():Double

Si recibimos como parámetro “CAJA10X10” deberás poder construir un objeto de la clase Caja que tenga una longitud, ancho y altura de 10 cm. Si el parámetro es “PELOTAFUTBOL” deberás poder construir un objeto de la clase pelota cuyo radio sea de 11 cm, tamaño del radio de una pelota de fútbol. Si se recibe como parámetro “PELOTATENIS” deberás construir un objeto pelota con un radio de 0,32 cm.

Con base en el enunciado:

A) Modificar el diagrama de clases con la implementación del Patrón Factory.
c) Realizar la programación del método calcularEspacio que devuelva (no muestre por consola) la cantidad de espacio necesario que necesita cada producto, es decir, el volumen que ocupa.
d) Realizar la programación del método calcularEspacioNecesario que devuelva la cantidad de espacio necesario para guardar todos los productos del almacén.

Consideraciones: contemplar todas las medidas en cm.





























Ejercicio 5 (Equipo-Jugador-Comparable):

Colecciones

Objetivo
Partiendo de las clases, programe en Java todas las clases con sus métodos y atributos. Utilice una colección para la relación 1 a muchos. 

Equipo=
- nombre :String
+ agregarJugador():Jugador jugador
+ mostrarJugadoresTitulares() : Void
+ getCantidadDeJugadoresTitularesLesionados(): int

Jugador=

- Integer numeroCamiseta;
- String nombre;
- Boolean estaLesionado;
- Boolean esTitular;

Consideraciones:

El método mostrarJugadoresTitulares() solo debe mostrar por consola aquellos jugadores que son titulares y ordenados por número de camiseta.
El método getCantidadJugadoresLesionados() debe ir sumando y devolver la cantidad de jugadores que están lesionados y que son titulares.




Ejercicio 6 (Institutos-Cursos-OfertasAcademicas):

Objetivo
Realizar el diagrama UML y programar en Java, implementando los patrones que se requieran, el siguiente enunciado:

Enunciado

Desafío
Un Instituto necesita desarrollar un sistema para el área comercial y académica que le permita armar ofertas académicas es decir armar paquetes con los cursos que se dictan en la institución para constituir programas intensivos. Estos cursos están diseñados a su vez para poder dictarse y ofrecerse en forma independiente sin necesidad de cursar un programa intensivo. Es decir, que tanto un curso como un programa son ofertas académicas que el área comercial podrá ofrecer.
Toda oferta académica es decir cursos y programas tienen un nombre, una descripción y deberán tener una funcionalidad que le permita al área comercial poder contar con un precio para cada una de estas ofertas con la siguiente lógica:
El precio de un curso se calcula de acuerdo a la cantidad de carga horaria mensual de esa materia por la cantidad de meses de duración de la misma y un valor hora que se establece por cada materia.
El precio de un programa intensivo es la sumatoria de los precios de todos los cursos que forman el programa y se bonifica un determinado porcentaje dependiendo del programa.
El Instituto deberá poder generar un informe que permita mostrar todos los cursos y programas que ofrece indicando el nombre y precio de cada uno. (no es necesario mostrar los cursos que tiene un programa intensivo).
Reproducir la siguiente situación en el método main e invocar al método que genera el informe.
Curso: Front End tiene una carga horaria de 16 hs mensuales de dos meses de duración con un precio de 1000 pesos la hora, es decir que tiene un precio de 32.000 pesos. 
Curso: Back End tiene una carga horaria de 20 hs mensuales de dos meses de duración con un precio de   900 pesos la hora, es decir que tiene un precio de  36.000 pesos. 
El programa intensivo FullStack que posee ambas materias y cuyo porcentaje de bonificación es de 20% tiene un precio final de 54.400 pesos.
