Introduccion a Ciencias de la Computacion

Practica 2

Rodriguez Espinosa Diomedis Estefany

OBJETIVO

El objetivo de esta practica es que el alumno ejercite la teoria acerca del uso y aplicacion
de las instrucciones condicionales dentro de un programa, ası como de la creacion y uso de
objetos de clases existentes.

DESCRIPCION GENERAL

En una institucion bancaria se requiere hacer cierto manejo de fechas para determinar, por
ejemplo, la fecha final de una inversion de dinero. Por ello el proposito de este problema
es escribir una clase para crear y manejar fechas y otra para calcular una inversion y su rendimiento.

La practica consiste en crear la clase Fecha la cual contiene diferentes metodos que manipulan 
la fecha en muchas formas. Se utiliza la sobrecarga de metodos, calcula la diferencia en dias entre dos
fechas, asi como la creacion de metodos auxiliares. Despues se creo la clase TiempoDeInversion, la cual
utiliza metodos y objetos de la clase Fecha.

COMPILACION EJECUCION
Desde la carpeta : DRodriguez/Practica02/src/icc
ejecutamos el comando para compilar el programa: javac Fecha.java
seguido del comando para ejecutar el programa: java Fecha.java

Y lo mismo para la clase TiempoDeInversion
Compilar: javac TiempoDeInversion.java
Ejecutar: java TiempoDeInversion.java

EJEMPLOS DE EJECUCION
Como la clase fecha no tiene metodo pincipal solo ejecutaremos la clase TiemposDeInversion, la cual
utiliza metodos de la clase Fecha.

Hola bienvenido al programa que calcula el tiempo de inversion
Cual es tu nombre?
El usuario responde ejemplo - Diomedis
Hola Diomedis cual es el monto a invertir?
ejemplo - 200
Cual es el dia de inicio de tu inversion?
ejemplo - 4
Cual es el mes de inicio de tu inversion?
ejemplo - 7
Cual es el anio de inicio de tu inverson?
ejemplo - 2026
Cual es el dia del fin de tu inversion?
ejemplo - 21
Cual es el mes del fin de tu inversion?
ejemplo - 12
Cual es el anio del fin de tu inversion?
ejemplo - 2027
Los dias de su inversion seran: 535
Su rendimiento sera: 35.178082191780824
¿Desea hacer otra simulacion?
ejemplo - no

Termina el programa.


Los archivos se subieron con su direccion correspondiente con fines academicos

```text

DRodriguez/

└── Practica02/

    └── src/

        └── icc/

            ├── Fecha.java

            └── TiempoDeInversion.java
