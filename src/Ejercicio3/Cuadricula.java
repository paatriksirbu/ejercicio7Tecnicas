package Ejercicio3;

import java.util.Random;

public class Cuadricula {

    private char[][] cuadricula;
    private int numFilas = 10;
    private int numColumnas = 10;
    private Barco barco;

    public Cuadricula() {   //Constructor sin argumentos que inicializa la cuadricula con agua por todas partes.
        cuadricula = new char[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                cuadricula[i][j] = 'A';
            }
        }
    }
    public Cuadricula(Barco barco){
        this.barco = barco;
    }


    public char[][] getCuadricula() {
        return cuadricula;
    }

    public int getNumFilas() {
        return numFilas;
    }

    public int getNumColumnas() {
        return numColumnas;
    }

    public static void mostrarTablero(Cuadricula cuadricula) {

        //Imprimir la linea superior del borde
        System.out.print(" +");
        for (int i = 1; i < cuadricula.numColumnas; i++) {
            System.out.print("--");
        }
        System.out.println("+");

        //Imprimir el tablero con bordes laterales.
        for (int i = 1; i < cuadricula.numFilas; i++) {
            System.out.print(" |");
            for (int j = 1; j < cuadricula.numColumnas; j++) {
                System.out.print(" " + cuadricula.cuadricula[i - 1][j - 1]);    //Ajustamos el codigo para que empiece a contar desde 1 en lugar de 0.
            }
            System.out.println(" |");
        }

        //Imprimir la linea inferior del borde
        System.out.print(" +");
        for (int i = 1; i < cuadricula.numColumnas; i++) {
            System.out.print("--");
        }
        System.out.println(" +");
    }

    public void depositarBarco(int fila, int columna, Barco barco) {
        fila--;
        columna--;

        if (fila < 0 || fila >= numFilas || columna < 0 || columna >= numColumnas && cuadricula[fila][columna] == 'A') {
            System.out.println("Posición fuera de la cuadricula");
            fila = (int) (Math.random() * numFilas);
            columna = (int) (Math.random() * numColumnas);
        } else if (cuadricula[fila][columna] == 'B') {
            System.out.println("Posición ocupada por otro barco");
        } else {
            fila = (int) (Math.random() * numFilas);
            columna = (int) (Math.random() * numColumnas);
            cuadricula[fila][columna] = 'B';

        }
    }



}
