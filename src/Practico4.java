public class Practico4 {
    public static void main(String[] args){
        //1
        //compareTo: si el numero a comparar es mas pequeño, devuelve 1, si es mas grande devuelve -1, si es igual devuelve 0.
        Integer num1 = 5;
        Integer num2 = 6;
        System.out.println(num2.compareTo(num1));
        //equals: retorna un booleano, no se puede utilizar con los primitivos, se utiliza con los de clase como reemplazo al ==.
        System.out.println(num2.equals(num1));
        //trim: quita los espacios al inicio y final de una oracion o palabra
        String pal = "     Hola ";
        System.out.println(pal);
        System.out.println(pal.trim());

        //2
        //Escribir el código necesario para mostrar el uso de los siguientes métodos de Math: max, min, abs,
        //pow, sqrt. Investigar cuáles otros métodos están disponibles.
        System.out.println(Math.max(5,6));//6
        System.out.println(Math.min(1,3));//1
        System.out.println(Math.abs(-3));//3
        System.out.println(Math.pow(5,2));//25.0 toma valores float
        System.out.println(Math.sqrt(100));//10 raiz cuadrada devuelve un float

        String string = "Hooola que tal como estas ooooo";// 10 o
        cuantasVecesAparece(string, 'o');

        eliminarEspacios(string);

        secuencia("AAGUGDLKWDAIHWUAAAACHWUWAAHICHIWOAAAAAAA");

        agregada("hola", "lboha");

        String frase1 = "gatovacaperroleonperrogatogatoovejaperro";
        String secuencia1a = "perro";
        String secuencia1b = "gato";
        System.out.println(mismaCantidad(frase1, secuencia1a, secuencia1b)); // Debería mostrar "SI"

        String frase2 = "perrogatovacaperrogatogato";
        String secuencia2a = "oveja";
        String secuencia2b = "gato";
        System.out.println(mismaCantidad(frase2, secuencia2a, secuencia2b)); // Debería mostrar "NO"

        String frase3 = "perrogatovacaperrogatogato";
        String secuencia3a = "oveja";
        String secuencia3b = "elefante";
        System.out.println(mismaCantidad(frase3, secuencia3a, secuencia3b)); // Debería mostrar "SI"

        System.out.println(mismasLetras("hshfewhfewoldva", "hola"));// SI



    }
    //3. Leer un string y un carácter e indicar la cantidad de veces que aparece ese carácter en el string.
    public static void cuantasVecesAparece(String string, char caracter) {
        int contador = 0;
        for (int i=0; i< string.length(); i++) {
            char letra = string.charAt(i);
            if (letra == caracter) {
                contador ++;
            }
        }
        System.out.println("El caracter "+ caracter +" aparece "+ contador + " veces en el string " + string);
    }

    //4. Implementar un método propio que comprima un string, esto es que elimine los espacios en blanco.

    public static void eliminarEspacios(String string) {
        String res = "";
        for (int i = 0; i< string.length(); i++ ){
            char caracter = string.charAt(i);
            if( caracter != ' '){
                res += caracter;
            }
        }
        System.out.println(res);
    }

    //5. Dado un string de largo máximo 100, que contiene letras en mayúsculas, indicar la secuencia más
    //larga de letras "A" consecutivas. Ejemplo: ABAABCA debe retornar 2.
    public static void secuencia(String frase) {
        int contador = 0;
        int aMax = 0;
        for (int i=0; i<frase.length(); i++) {
            if (frase.charAt(i)=='A'){
                contador++;
            } else {
                if (contador>aMax){
                    aMax = contador;
                }
                contador = 0;
            }
        }
        if (contador > aMax) {
            aMax = contador;
        }
        System.out.println(aMax);
    }

    //6. Se reciben dos strings en minúsculas. El segundo contiene las mismas letras del primero
    //desordenadas, pero se agregó una letra más en algún lugar. Identificar cuál letra es.
    public static void agregada(String primera, String segunda){
        char letra = 0;
        for (int i=0; i< segunda.length(); i++){
            if (primera.indexOf(segunda.charAt(i)) == -1){
                letra = segunda.charAt(i);
            }
        }
        System.out.println(letra);
    }

    //7. Dada una frase (string) y dos secuencias de largo máximo 100, retornar "SI" si las dos secuencias
    //aparecen la misma cantidad de veces en el string. En otro caso retornar "NO".
    public static String mismaCantidad(String frase, String secuencia1, String secuencia2){
        String res = "NO";
        int contador1 =0;
        int contador2 =0;
        int index = 0;
        while ((index = frase.indexOf(secuencia1, index)) != -1) {
            contador1++;
            index += secuencia1.length(); // Mover el índice hacia adelante
        }
        index = 0;
        while ((index = frase.indexOf(secuencia2, index)) != -1) {
            contador2++;
            index += secuencia2.length(); // Mover el índice hacia adelante
        }
        if (contador1 ==contador2){
            res = "SI";
        }
        return res;
    }
    //8. Dados dos strings, retornar "SI" si el primer string contiene todas las letras del segundo string o
    //"NO" en otro caso. Se asumen los dos string vienen en mayúscula.
    public static String mismasLetras(String frase1, String frase2){
        String tieneTodas = "SI";
        for (int i=0; i<frase2.length(); i++){
            if (frase1.indexOf(frase2.charAt(i) ) == -1){
                tieneTodas = "NO";
            }
        }
        return tieneTodas;
    }



}
