
/** Pasos para la ejecución de un programa en java */

/**
 * 1.- Dentro de la carpeta con el compilador javac ejecutar javac Main.java
 *     esto nos creara el bytecode en main.class.
 * 2.- Para ejecutar con la JVM se ejecuta java Main, sin el .class y ejecuta el programa
 */

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}