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













