import java.util.Scanner;

public class Practico2 {
    public static void main(String[] args) {
        /*int[] lista = {5, 4, 1, 2};
        ejercicio1(lista);

         */
        ejercicio2();
        ejercicio2V2();


    }
    public static void ejercicio1(int[] numeros){
        String asteriscos;
        for (int num: numeros) {
            System.out.println();
            System.out.print(num);
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            }

        }
    }

    public static void ejercicio2() {
        Scanner lector = new Scanner(System.in);
        int numeroIngresado;
        int numerosInverso[] = new int[10];
        for (int i=1; i<=10; i++) {
            System.out.println("Ingrese el numero " + i);
            numeroIngresado = lector.nextInt();
            numerosInverso[10-i] = numeroIngresado;
        }
        System.out.print("Los numeros en orden inverso son: ");
        for (int num: numerosInverso) {
            System.out.print(num);
        }
    }
    public static void ejercicio2V2() {
        Scanner lector = new Scanner(System.in);
        int numeroIngresado;
        int numeros[] = new int[10];
        for (int i=0; i<10; i++) {
            System.out.println("Ingrese el numero " + i);
            numeroIngresado = lector.nextInt();
            numeros[i] = numeroIngresado;
        }
        System.out.print("Los numeros en orden inverso son: ");
        for (int i=9; i>=0; i--) {
            System.out.print(numeros[i]);
        }
    }

    public static void ejercicio3() {
        Scanner lector = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Ingrese un numeros: ");
        for (int i = 0; i< arr.length; i++) {

        }
        int numeroIngresado = lector.nextInt();
        int numeros[] = new int[10];
    }


}
