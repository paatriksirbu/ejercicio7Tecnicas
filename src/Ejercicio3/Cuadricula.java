package Ejercicio3;

public class Cuadricula {

    private char[][] cuadricula;
    private int numFilas = 10;
    private int numColumnas = 10;

    public Cuadricula() {
        cuadricula = new char[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                cuadricula[i][j] = ' ';
            }
        }
    }

    public static void mostrarTablero(Cuadricula cuadricula) {

        //Imprimir la linea superior del borde
        System.out.println(" +");
        for (int i = 0; i < cuadricula.numColumnas; i++) {
            System.out.print(" --");
        }
        System.out.println("+");

        //Imprimir el tablero con bordes laterales.
        for (int i = 0; i < cuadricula.numFilas; i++) {
            System.out.print(" |");
            for (int j = 0; j < cuadricula.numColumnas; j++) {
                System.out.print(" " + cuadricula.cuadricula[i][j]);
            }
            System.out.println(" |");
        }

        //Imprimir la linea inferior del borde
        System.out.print(" +");
        for (int i = 0; i < cuadricula.numColumnas; i++) {
            System.out.print(" --");
        }
        System.out.println("+");
    }


}
