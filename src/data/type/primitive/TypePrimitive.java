package data.type.primitive;

/** Tipos de datos primitivos */

public class TypePrimitive {

    /** Variable con valor por defecto de una clase*/
    int isIntClass;

    /** Variale static con valor por defecto */
    char ischarClass;

    public static void main(String[] args){
        System.out.println("Tipos de datos primitivos");

        // Tipo de dato byte
        byte isByte = 12;

        // Tipo de datos short
        short isShort = 1_200;

        // Tipo de dato int
        int isInt = 144_556;

        // Tipo de dato long
        long isLong = 1_000_000L;

        // Tipo de dato float
        float isFloat = -99_788.999f;

        // Tipo de dato double
        double isDouble = 788_899.99_887_666;

        // Tipo de dato char
        char isChart = '\u0000';

        // Tipo de dato boolean
        boolean isBoolean = false;

        // Elementos de un arreglo con valores por defecto
        int[] nums = new int[3];

        // Valor dentro del metoso que no se inicializa, marca error de compilación
        int validate;

        // Instancia de la clase
        TypePrimitive typePrimitive = new TypePrimitive();

        // Impresión de resultados
        System.out.println("Valor de byte: " + isByte);
        System.out.println("Valor de short: " + isShort);
        System.out.println("Valor de int: " +  isInt);
        System.out.println("Valor de long: " +  isLong);
        System.out.println("Valor de float: " +  isFloat);
        System.out.println("Valor de double: " +  isDouble);
        System.out.println("Valor de char: " +  isChart);
        System.out.println("Valor de boolean: " +  isBoolean);

        // Información de tipos de datos primitivos
        System.out.println("\n Información de tipo de datos primitivos");
        System.out.println("byte: 8 bits, 1 byte, rango es de -128 a 127 por defecto es 0");
        System.out.println("short: 16 bits, 2 bytes, rango es de -32768 a 32767 defect0 es 0");
        System.out.println("int: 32 buts, 4 bytes, rabgo es de -2millones a 2millones, defecto es 0");
        System.out.println("long: 64 bits, 8 bytes, rango es - a -, por defecto es 0L");
        System.out.println("float: 32 bits, 4bytes, por defecto tiene entre 6 a 7 decimales, por defecto es 0.0f");
        System.out.println("double: 64 bits, 8 bytes por defecto tiene entre 15 a 17 decimales, es 0");
        System.out.println("char: 16 bits, 2 bytes, su rango es de 0 a 65535 y por defecto es 0 o \u0000");
        System.out.println("Boolean: por defecto es false y varia dependiendo de la jvm su tamaño");

        // Información sobre constantes utiles maximos y minimos
        System.out.println("\n Información sobre constantes utiles");
        System.out.println("byte: min: " + Byte.MIN_VALUE + " max: " + Byte.MAX_VALUE);
        System.out.println("short: min: " + Short.MIN_VALUE + " max: " + Short.MAX_VALUE);
        System.out.println("int: min: " + Integer.MIN_VALUE + " max: " + Integer.MAX_VALUE);
        System.out.println("long: min: " + Long.MIN_VALUE + " max: " + Long.MAX_VALUE);
        System.out.println("float: min: " + Float.MIN_VALUE + " max: " + Float.MAX_VALUE);
        System.out.println("double: min: " + Double.MIN_VALUE + " max: " + Double.MAX_VALUE);
        System.out.println("char: min: " + Character.MIN_VALUE + " max: " + Character.MAX_VALUE);

        // Variables con valores por defecto
        System.out.println("\n Variables con valores por defecto");
        System.out.println("Valor de int: " + typePrimitive.isIntClass);
        System.out.println("Valor de static: " + typePrimitive.ischarClass);
        System.out.println("Impresión de elementos de un arreglo: " + nums[0]);
        // System.out.println("Valor dentro del metodo no inicilizado: " + validate); // Marcara error
    }
}
