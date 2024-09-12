//Hola
// hola

public class Practico3 {
    public static void main(String[] args) {
        int[][] matrizAlumnos = {{3,6,3}, {1,4,6}, {4,4,4}};
        //ejercicio1(matrizAlumnos);
        int[][] matrizRectangular = {{3, 5}, {2, 4}, {-1, -2}, {-1, 8}};
        //ejercicio2(matrizRectangular);
        int[][] mat = {{1,2,3}, {4,2,0}, {1,2,3}};
        //ejercicio3(mat);
        repetidos(matrizAlumnos, 0, 1);
    }
    /*
    Implementar un método que recibe una matriz que corresponde a las notas de 30 alumnos en 6
materias y retorna el promedio general de calificaciones (considerando los 6 exámenes).
         */
    public static void ejercicio1(int[][] matriz) {
        double suma = 0.0;
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("El promedio es " + suma/(matriz.length * matriz[0].length));
    }
    //Dada una matriz rectangular, retornar un array que contenga la suma de sus columnas.
    public static void ejercicio2(int[][] matriz) {
        for (int j=0; j < matriz[0].length; j++) {
            int suma = 0;
            for (int i=0; i< matriz.length; i++) {
                suma += matriz[i][j];
            }
            System.out.println("La suma de la columna " +j+ " es " +suma);
        }
    }

    /*
    Se desea implementar un método que detecte si una matriz es “especial”. Una matriz es especial
    si se cumplen estas propiedades:
    - la suma de todos los valores de una fila, es la misma para todas las filas.
    - la suma de todos los valores de una columna, es la misma para todas las columnas.
    - las dos sumas anteriores son iguales entre sí y además es igual a la suma de los valores de la
    diagonal principal.
     */
    public static boolean ejercicio3(int[][] matriz) {
        int suma;
        int sumaCte = 0;
        int sumaDiagonal = 0;
        boolean numerosIguales = true;
        int[] sumaCols = new int[matriz[0].length];

        for (int i=0; i<matriz.length; i++){
            suma = 0;
            for (int j=0; j< matriz[i].length; j++) {
                if (i==0) {
                    suma += matriz[i][j];
                    sumaCte = suma;
                } else {
                    suma += matriz[i][j];
                }
                sumaCols[i] += matriz[i][j];
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }
            }
            if (sumaCte != suma) {
                numerosIguales = false;
            }
        }
        for (int k=0; k<sumaCols.length; k++) {
            if (sumaCte != sumaCols[k]) {
                numerosIguales = false;
            }
        }
        if (sumaCte != sumaDiagonal) {
            numerosIguales = false;
        }
        System.out.println(numerosIguales);
        return numerosIguales;
    }

    public static boolean repetidos (int [][] mat, int fila, int col){
        int num = mat [fila][col];
        //hola sifhbeirv
        int f = fila;
        int c = col;
        for(int i = 0;i<4;i++){
            if(i==0){
                f = fila + 1;
                c = col + 1;
            }
            if(i==1){
                f = fila + 1;
                c = col - 1;
            }
            if(i==2){
                f = fila - 1;
                c = col + 1;
            }
            if(i==3){
                f = fila - 1;
                c = col - 1;
            }
           while(f<=mat.length-1 && c<= mat[0].length-1 && f>=0 && c>=0){
            if(i==0){
                f++;
                c++;
            }
            if(i==1){
                f++;
                c--;
            }
            if(i==2){
                f--;
                c++;
            }
            if(i==3){
                f--;
                c--;
            }
            
            if(mat[f][c] == num){
                return true;
            }
            
            } 
        }
        return false;
        
    }

}














