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
                res+= caracter;
            }
        }
        System.out.println(res);
    }

}
