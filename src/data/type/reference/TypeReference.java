package data.type.reference;

import java.io.ObjectInputFilter;
import java.util.ArrayList;

/** Tipos de datos por referencia */

public class TypeReference {

    String isStringLocal;

    public static void main(String[] args){

        // Variable String inicializada en null para evitar error
        String name = null;

        System.out.println("\n Inicializador de variables de referencia");
        System.out.println("Valor de string sin inicializar: " + name);

        // NullpointerExeption (NPE)
        // Se lanza NPE cuando se intenta acceder a un objeto en null
        // Declaración en null
        String npe = null;

        // Lanza NPE
        // npe.toUpperCase(); // NPE
        // npe.length(); // NPE

        // Lo que no lanza un NPE
        System.out.println(npe);
        System.out.println("Valsor de string null: " + npe);
        String copyNpe = npe; // Copiar referencia de memoria


        // instanceof
        // Valida si un ojeto es de tipo concreto
        String inInstanceof = "dif";
        System.out.println(inInstanceof instanceof String); // true
        System.out.println(inInstanceof instanceof Object); // true


        // Creación de objetos
        // Perro perro = new Perro(); // Con new para llamar al constructor
        String a = "nombre"; // Literal con string
        Integer i = 10; // Autoboxing (Conversion de un tipo primitivo a su clase)
        int[] x = {1,2,3}; // Lista de arreglos
        // var lista = ArrayList<String>(); // Lista de array


        // Asignación de una referencia, copia la dirección no el objeto
        StringBuilder nameOfStringBuilder = new StringBuilder("hola"); // Creación de string builder
        StringBuilder secondNameOfStringBuilder = nameOfStringBuilder; //Asignación de dirección de objeto
        secondNameOfStringBuilder.append(" Mundo"); // Asignación de nuevos valores
        System.out.println("\n Asignación de referencia");
        System.out.println("Valor de string builder: " + nameOfStringBuilder);

        // .equals() y ==
        // La principal diferencia es que .equals() realiza la comparación del valor y ==
        // hace la comparación de la dirección de memoria
        String aEquals = "a"; // Valor 1
        String bEquals = "a"; // Valor 2
        System.out.println(aEquals == bEquals); // false: realiza la compración de dirección de memoria
        System.out.println(aEquals.equals(bEquals));// true: realiza la comparación del valor

     }
}
