# 🚀 Guia de estudio para la certificación de java 21 OCP IZO-830

> Esta es una guia para la certificación de java 21 OCP. La cual tiene como finalidad poder
> dar los conocimientos para realizar dicha certificación.
 
***

## 📌 Indice
1. [Convención de nomenglatura en java](#Convencion_de_nomenclatrura_en_java)
2. [Sobre java](#Sobre_java)
3. [Metodo main, package e import](#metodo-main-package-e-import)
4. [Tipos de datos](#tipos-de-datos)

# Convención de nomenclatura en java

En java existen una convención de nomenglatura que define como debes de nombrar packages, clases, métodos etc.

| Nombre    |           Tipo            |        Ejemplo        |
|:----------|:-------------------------:|:---------------------:|
| Packages  |         lowercase         | com.empresa.proyecto  |
| Classes   | UpperCamelCase/PascalCase |       MyStudent       |
| Interaces | UpperCamelCase/PascalCase |      Comparable       |
| Methods   |       lowerCameCase       |       getName()       |
| Variables |       lowerCameCase       |     nameOfCountry     |
| Constants |     UPPER_SNAKE_CASE      |       MAX_SIZE        |


# Sobre java

Java es un lenguaje de programación **de proposito general** es decir sirve para hacer casi cualquier tipo de software, 
fue creado por **James Gosling** en 1995 y en 2010 **Oracle** lo adquirio y desde entonces es Oracle el que brinda soporte.

Dentro de sus caracteristicas principales son:
- Java es un lenguaje de alto nivel.
- En java todo es un objeto, todo gira en clases y objetos.
- Es multiplataforma, es decir se puede correr en linux, windows, mac.
- Utiliza el tipado estatico, cada variable va por tipo y el compilador revisa los errores antes de ejecutar.
- Compila e interpreta a la vez, primero se compila a formato intermedio **bytecode** y luego la **JVM** lo ejecuta.
- Multi-hilo, puedo hacer varias cosas a la ves.

**JVM, JRE, JDK**
- JVM (Java virtual machine): Es el programa de ejecutar el bytecode (.class)
- JRE (Java Routime Enviroment): JVM + Librerias de java para ejecutar programas
- JDK (Java Develoment Kit): JRE + Herramientas para desarrollar programas

*Nota: Desde Java 11 Oracle dejo de separar el JRE y actualemente viene directo en el JDK*

**Compilación de un programa de java**
> Zoo.java (Código fuente)-> **javac** -> zoo.class (bytecode)-> **JVM**, **JIT** -> Código de maquina

**Algunas herramientas del JDK**
- JAR: Java aplication resoruces
- javadoc: Genera documentación apartir de comentarios /** */
- jdeps: Analiza a que dependencias pertenece tu código
- jlink: Crea un runtime personalizado
- jmod: Trabaja con archivos de modulo .jmod

**Flujo de JVM**
- Carga los .class cuando se nececitan, los que generó *javac*
- Comprueba que el bytecode sea valido
- Interpretación + JIT
- Libera automaticamente la memoria cuando ya no se utilizan los objetos

# Metodo main, package e import

**Main**

El método main es el punto de entrada principal del programa, es lo que se ejecuta y debde de aparecer exactamente asi
``` java
public static void main(String[] args)
```
La estructura del método **main** es la siguiente:
- **Public**: Esto para que la *JVM* pueda llamarlo fuera de la clase
- **Static**: La *JVM* lo llama sin crear objetos de la clase
- **Void**: Para que no reciba retorno la función
- **main**: Tal cual la leyenda *main* es como la *JVM* la conoce
- **String[] args**: Recibe los argumentos

Algunas variantes validas
``` java
public static void main(String[] args) // Como esta actualmente
public static void main(String args[]) // Corchetes despues del nombre
public static void main(String []args) // Los espacios no importan
public static void main(String... args) // Equivalencia a un arreglo
public static void main(String[] name) // El nombre del parametro es libre
static public void mian(String[] args) // El orden de los modificadores no importa
public static final void main(String[] args) // Final esta permitido
public static void main(final String[] args) // Final en el parametro tambien
public static synchronized main(String[] args) // Tambien esta permitido
public static void main(String[] args) throws Exeption // Puede declarar una exepcion
```

Variantes que compilan pero **no** sirven como punto de entrada
``` java
public void main(String[] args) // Falta static
static void main(String[] args) // Falta public
public static int main(String[] args) // La función retorna
public static void Main(String[] args) // El nombre main comeinza con M mayuscula
public static void main(String args) // No es un arreglo
public static void main(Object[] args) // Es un objeto no un arreglo
public static void main() // Faltan parametros
```

Vairnates invalidas / no compilan
``` java
public static void main(String args...) // sintaxis incorrecta
public static main(String[] args) // Falta el tipo de retorno
public void static main(String[] args) // el tipo de retorno debe ir antes del nombre
```

**Package**

Si existe, debe ser la primera instruccion del archivo antes solo pueden ir comentarios y lineas en blanco, solo puede
tener una declaración de **package** por arhcivo, cada parte del packege es separado por puntos y debe de ser un identificador
valido, por convenciones se escriben en minusculas y sin que comiencen con numeros.

``` java
package com.zoo.v2; // Valido
package com.zoo.2v; // No es valido porque comienza con numero
package com.zoo.class; // No es valido porque class es una palabra reservada
package com.zoo._animales; // Valido
package com.zoo.$animales; // Valido
```

**Import**

Sirve para evitar tener que escribir el nombre completo de la clase cada vez que se llame

El orden que sigue un programa es **PIC** *(Package-Import-class)*, cualquier otro orden no compila.

Tipos de import
1. Import de una sola clase
``` java
import java.util.ArrayList;
```

2. Import con comodin

*Se encargan de importar todas las clases del packege*
 ``` java
 import java.util.*;
 ```

3. Import estatic

*Importan metodos static, es decir miembros y variables*
``` java
import satic java.labg.Math. PI;
````


# Tipos de datos

**Tipos de datos primitivos**

Los tipos de datos primitivos son aquellos que guardan directamente su valor en un variable, no tienen metodos, no son 
y no pueden valer null. En java existen **8** tipos de datos primitivos *(byte, short, char, int, float, double, long, boolean)*


Tabla maestra


| Tipo    | Bits | Bytes |        Minimo        |       Maximo        |    Default     |
|:--------|:----:|:-----:|:--------------------:|:-------------------:|:--------------:|
| byte    |  8   |   1   |         -128         |         127         |       0        | 
| short   |  16  |   2   |        -32768        |        32767        |       0        | 
| int     |  32  |   4   |     -2147483648      |     2147483647      |       0        | 
| long    |  64  |   8   | -9223372036854775808 | 9223372036854775807 |       0L       | 
| float   |  32  |   4   |          -           |          -          |       0F       | 
| double  |  64  |   8   |          -           |          -          |       0        | 
| char    |  16  |   2   |          0           |        65535        | 0 / ('\u0000') | 
| boolean |  -   |   -   |          -           |          -          |     false      | 

*Nota: float tiene unos 6, 7 decimales y double unos 15, 16*

Constantes utiles

*(Para identificar el rango de valores)*
``` java
    Byte.MIN_VALUE; // -128
    Byte.MAX_VALUE; // 127
    Short.MIN_VALUE; // -32768
    Short.MAX_VALUE; // 32767
    Integer.MAX_VALUE; // -
    Integer.MAX_VALUE; // -
    Double.MIN_VALUE; // -
    Double.MAX_VALUE; // -
    Float.MIN_VALUE; // -
    Float.MAX_VALUE; //-
    Character.MIN_VALUE; //
    Character.MAx_VALUE;
```

Variables por defecto

Cuando y donde se declaran las variables para poder recibir un valor por defecto

- Varianle de instancia (atributo de un objeto)
- Variable static de la clase
- Elementos de un arreglo
- **No funciona para variables locales, dentro de un metodo**


Conversiones

Implicita y automatica

**byte - short - int - long - float - double**

``` java
int i = 100;
long l = 1;
double d = l;
float f = d;
int x = 'A'; // Valor de 65
```

chat y short no se convierte entre si aun que ambos tienen **16 bits** pero char no tiene signo y short si
``` java
short s = 'A';
char c = 'A';
short s2 = c; // Necesita cast
```

Reduccion

Se necesita un cast explicito
``` java
double d = 9.99;
int i = (int) d; // 9 (Trunca los decimales, no redondea)

int x = 200;
byte b = (byte) x; // Desbordamiento de memoria
```

Promoción númerica en operaciones

- Si los operadores son de tipo distinto, el menor se convierte en mayor
- Si uno es entero y otro decimal, el entero se convierte a decimal
- byte, short y char siempre se convierten a int
- El resultado tiene el tipo de los operadores ya convertidos


Tipo por defecto de los literales

Una literal  es un valor escrito directamente en código ej. 4, 3.34, 'A'
**, una literal tiene su propio tipo antes de que se asigne a una variable**

``` java
long x = 5;
```

¿Por qué precisamente int y double?

Double e int son los datos que soportan la mayoria de valores ya sea para enteros o flotantes

El compilador es el que decide a travez de una seria de preguntas como ejemplo


**Tipos de datos por referencia**

La diferencia principal radica en que el tipo de dato primitivo guarda el valor y el tipo de dato de referencia
guarda la referencia del objeto que se ingreso.

Los tipos de datos de referencia son todo aquello que no sea uno de los 8 tipos de datos primitivos


| Tipo           |                       Ejemplo                       |
|:---------------|:---------------------------------------------------:|
| class jdk      | String, Stringbuilder, Object, LocalDate, Arraylist | 
| class wrapper  |         Integer, Double, Character, Boolean         | 
| Clases propias |                   class studen {}                   | 
| Interfaces     |             List, Runnable, Comparable              | 
| Enums          |              enum Color {Rojo, Verda}               | 
| Record         |           record Punto (int x, int y) {}            | 
| Array          |              int[], String[], int[][]               | 

Valores por defecto

A diferencia de los tipos de datos **primitivos** estos no si pueden inicializarse con null

``` java
String x = null; // Correcto, si puede ser null
Integer y = null; // Correcto, si puede ser null
int i = null; // Un primitivo no puede ser null
```

**NullPointerExecption**

Se lanza cuando se intenta lanzar un objeto a travez de una referencia null

```java
String x = null; // Declaración de variable
x.length(); // NPE
x.toUppercase(); // NPE
```

Lo que no lanza un **NPE**
```java
String x = null; 
System.out.printl("valor " + x); // La concatenación convierte null en "null"
System.out.printl(x == null); // true
String y = x; // Copia la referencia de memoria
```

**instanceOf**

Es un operador para determinar si un objeto es de tipo concreto
```java
String x = "name";
System.out.printl(x instanceof String); // Devuelve true
System.out.printl(x instanceOf Object); // true, todo string es un objeto

```

**Crear Objetos y asignarles referencias**

Formas de crear objetos
``` java
Perro perro = new Perro(); // con new para llamar al constructor
String a = "name"; // literal String
Integer i = 5; // autoboxing
int[] rex = {1, 2, 3, 4}; // Arreglo
var lista = new ArraList<String>()
```

Asignar una referencia, copia el dirección no el objeto

``` java
StringBuilder a = new StringBuilder("a"); // Creacion de objeto
StringBuilder b = a; // Asignación de referencia, apunta al mismo objeto de a
b.append(" Mundo"); // Concatenación para StringBuilder
System.out.printl(a); // Como se apunta al mismo objeto se concatena el valor de a -> a Mundo
```

**Nota** cuando dos variables apuntan al mismo **objeto** se dice que son aias, ya que un cambio se ve a travez de las dos

**== frente .equals()**

La diferencia es **==** hace referencia hacia el mismo objeto, la misma dirección, **.equeals()** valida el contenido

```java
String a = "a"; // Objeto 1
String b = "a"; // Objeto 2
System.out.printl(a == b); // false, distinta dirección de memoria
System.out.printl(a.equals(b)); // true: tienen el mismo valor
```

**.equals()** por defecto

Si una clase no sobrescribe equals(), hereda de object que seria lo mismo que comparar ==

```java
class Perro {String: nombre;}
Perro p1 = new Perro("a"); // Declaración de valor 1
Perro p2 = new Perro("a"); //Declaración de valor 2
p1.equeals(p2); // false: comparación de dirección de mamoria
```