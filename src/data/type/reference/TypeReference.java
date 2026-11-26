package data.type.reference;

import java.io.ObjectInputFilter;

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


    }
}
