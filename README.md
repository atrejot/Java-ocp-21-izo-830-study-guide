# 🚀 Guia de estudio para la certificación de java 21 OCP IZO-830

> Esta es una guia para la certificación de java 21 OCP. La cual tiene como finalidad poder
> dar los conocimientos para realizar dicha certificación.
 
***

## 📌 Indice
1. [Sobre java](#Sobre_java)

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