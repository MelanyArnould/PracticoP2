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

        int[][] matrizDiagonales = {{1,1,5,1,1},{1,1,1,1,1},{5,1,1,1,1}};
        ejercicio4(matrizDiagonales,0,2);

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
    /*
    Dada una matriz y una posición en esa matriz (dada por la fila y la columna) indicar si el elemento
    que se encuentra en esa posición está repetido o no en alguna de las diagonales que pasan por esa
    posición.
     */
    public static boolean ejercicio4(int[][] mat, int  fila, int col) {
        boolean repetido = false;
        for (int i=fila+1; i<mat.length && !repetido; i++) {
            for (int j= col+1; j< mat[i].length; j++) {
                if (mat[i][j] == mat[fila][col]) {
                    repetido = true;
                }
            }
            for (int j= col-1; j>=0 && !repetido; j--) {
                if (mat[i][j] == mat[fila][col]) {
                    repetido = true;
                }
            }
        }
        for (int i=fila-1; i>=0 && !repetido; i--) {
            for (int j= col+1; j<mat[i].length; j++) {
                if (mat[i][j] == mat[fila][col]) {
                    repetido = true;
                }
            }
            for (int j= col-1 ; j>=0 && !repetido; j--) {
                if (mat[i][j] == mat[fila][col]) {
                    repetido = true;
                }
            }
        }
        System.out.println(repetido);
        return repetido;
    }
    public static boolean repetidosProfe(int[][] mat, int  fila, int col) {
        int valor = mat[fila][col];
        boolean repetido = false;
        //Chequeo arriba a la izquierda
        int i=fila -1;
        int j=col -1;
        while (i>=0 && j>=0 && !repetido) {
            if (mat[i][j] == valor) {
                repetido = true;
            }
            i--;
            j--;
        }
        //Chequeo arriba a la derecha
        i=fila -1;
        j=col +1;
        while (i>=0 && j<=mat[0].length && !repetido) {
            if (mat[i][j] == valor) {
                repetido = true;
            }
            i--;
            j++;
        }
        //Chequeo abajo a la izquierda
        i=fila +1;
        j=col -1;
        while (i< mat.length && j>=0 && !repetido) {
            if (mat[i][j] == valor) {
                repetido = true;
            }
            i++;
            j--;
        }
        //Chequeo abajo a la derecha
        i=fila +1;
        j=col +1;
        while (i< mat.length && j<=mat[0].length && !repetido) {
            if (mat[i][j] == valor) {
                repetido = true;
            }
            i++;
            j++;
        }
        return repetido;
    }

    public static boolean repetidos (int [][] mat, int fila, int col){
        int num = mat [fila][col];
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














