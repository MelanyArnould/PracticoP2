import java.util.Scanner;

public class Practico1 {
    public static void main(String[] args) {

        ejercicio11();
    }
    public static void ejercicio1() {
        int a=8;
        int b=3;
        int c=-5;
        System.out.println("a)"+ a+b+c);
        System.out.println("b)"+ 2*b+3*(a-c));
        System.out.println("c)"+ a/b);
        System.out.println("d)"+ a%b);
        System.out.println("e)"+ a/c);
        System.out.println("f)"+ a%c);
        System.out.println("g)"+ a*b/c);
        System.out.println("h)"+ a*(b/c));
        System.out.println("i)"+ (a*c)%b);
        System.out.println("j)"+ a * (c % b));
        System.out.println("k)"+ (3 * a - 2 * b) % (2 * a - c));
        System.out.println("l)"+ 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2));
        System.out.println("m)"+ (a - 3 * b) % (c + 2 * a) / (a - c));
        System.out.println("n)"+ (a - b - c * 2));
    }
    public static void ejercicio2() {
        boolean w=false;
        boolean x=true;
        boolean y=true;
        boolean z=false;
        System.out.println(w || y && x && w || z);
        System.out.println(x && !y && !x || !w && y);
        System.out.println( !(w || !y) && x || z);
        System.out.println(x && y && w || z || x);
        System.out.println(y || !(y || z && w));
        System.out.println(!x && y && (!z || !x));
    }
    public static void ejercicio3() {
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese un nombre:");
        String nombre = lector.nextLine();

        System.out.println("Ingrese su edad:");
        int edad = lector.nextInt();

        //Chequeo edad
        while (edad < 18) {
            System.out.println("Edad invalida, ingrese de nuevo:");
            edad= lector.nextInt();
        }

        //Ingreso del sueldo
        System.out.println("Ingrese sueldo:");
        int sueldo= lector.nextInt();

        double nuevoSueldo;

        if (edad<=50) {
            nuevoSueldo = sueldo*1.05;
        }else if (edad<=60) {
            nuevoSueldo = sueldo*1.1;
        } else {
            nuevoSueldo = sueldo*1.15;
        }

        System.out.println("El sueldo del/la funcionario/a " + nombre + " es: " + nuevoSueldo);
    }
    //Pedir el ingreso de 10 números y mostrar la suma de ellos.
    public static void ejercicio4() {
        int suma = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Por favor, ingrese 10 numeros");
        for(int i=1; i<=10; i++) {
            System.out.println("Ingrese el numero " + i);
            int numero = lector.nextInt();
            suma += numero;
        }
        System.out.println("La suma de los numeros es " + suma);
    }
    //Ingresar una cantidad de grados centígrados y mostrarlos en Fahrenheit. La fórmula es: F = 32 + (9 * C / 5)
    public static void ejercicio5() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese los grados centígrados: ");
        int grados = lector.nextInt();

        int gradosConvertidos = 32 + (9 * grados / 5);
        System.out.println(grados + " grados centigrados son " + gradosConvertidos + " Fahrenheit.");
    }
    //Leer una velocidad en Km/h y mostrarla en m/s.
    public static void ejercicio6() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la velocidad en km/h: ");
        double velocidad = lector.nextDouble();
        double velocidadConvertida = (velocidad/3.6);
        System.out.println("La velocidad " + velocidad + "km/h equivale a " + velocidadConvertida + "m/s");
    }
    //Leer un número de 3 cifras y mostrar sus dígitos.
    public static void ejercicio7() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero de tres cifras: ");
        int numero = lector.nextInt();
        String numeroStr = String.valueOf(numero);

        for (int i=0; i<3; i++) {
            System.out.println(numeroStr.charAt(i));
        }
    }
    //Imprimir 10, 20, ..., 1000. Diseñar soluciones diferentes utilizando: for, while, do while
    public static void ejercicio8() {
        for (int i=10; i<=1000; i+=10) {
            System.out.print(i + " ");
        }
        System.out.println();
        int num=0;
        while (num<1000) {
            System.out.print((num+=10) + " ");
        }
        System.out.println();
        num = 0;
        do {
            System.out.print((num+=10) + " ");
        } while (num<1000);
    }
    //Pedir el ingreso de 10 números e indicar la suma de los pares y la de los impares
    public static void ejercicio9() {
        int sumaPares=0;
        int sumaImpares=0;
        Scanner lector = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Ingrese un numero ("+i+"): ");
            int numero = lector.nextInt();
            if (numero%2==0) {
                sumaPares += numero;
            } else {
                sumaImpares += numero;
            }
        }
        System.out.println("La suma de los numeros pares es: " + sumaPares);
        System.out.println("La suma de los numeros impares es: " + sumaImpares);
    }
    //Anotar 4 enunciados diferentes en Java que sumen 1 a la variable entera i.
    public static void ejercicio10(){
        //i++
        //i+=1
        //i=i+1
    }
    //Ingresar la hora y minutos de entrada de un funcionario a la empresa, también la hora y minutos
    //de salida. Indicar la cantidad de horas y minutos que trabajó. Se asume que el funcionario entra y sale
    //durante el mismo día
    public static void ejercicio11() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la hora de entrada: ");
        int horaEntrada = lector.nextInt();
        System.out.println("Ingrese los minutos de entrada: ");
        int minutosEntrada = lector.nextInt();
        System.out.println("Ingrese la hora de salida: ");
        int horaSalida = lector.nextInt();
        System.out.println("Ingrese los minutos de salida: ");
        int minutosSalida = lector.nextInt();

        int cantidadHorasTrabajadas = Math.abs(horaEntrada-horaSalida) ;
        int cantidadMinutosTrabajados = minutosEntrada+minutosSalida;
        if (cantidadMinutosTrabajados>60) {
            cantidadMinutosTrabajados -= 60;
            cantidadHorasTrabajadas += 1;
        }
        System.out.println("El funcionario ha trabajado " + cantidadHorasTrabajadas + " horas y " + cantidadMinutosTrabajados + " minutos");
    }
}











