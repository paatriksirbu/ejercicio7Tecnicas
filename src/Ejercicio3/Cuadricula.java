package Ejercicio3;

import java.util.Random;

public class Cuadricula {

    private char[][] cuadricula;
    private int numFilas = 10;
    private int numColumnas = 10;

    public Cuadricula() {   //Constructor sin argumentos que inicializa la cuadricula con agua por todas partes.
        cuadricula = new char[numFilas][numColumnas];
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                cuadricula[i][j] = 'A';
            }
        }
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
        } else if (cuadricula[fila][columna] == 'B') {
            System.out.println("Posición ocupada por otro barco");
        } else {
            fila = (int) (Math.random() * numFilas);
            columna = (int) (Math.random() * numColumnas);
            cuadricula[fila][columna] = 'B';

        }
    }

    //Creamos un metodo que haga que el barco se mueva segun la situacion ambiental. Entendiendo que puede haber viento y corrientes marinas,
    //el barco se podra mover aleatoriamente en cualquier direccion (arriba, abajo, izquierda, derecha), siempre en posiciones adyacentes..
    public void moverBarco(Barco barco){
        Random random = new Random();
        int direccion = random.nextInt(4);

        int filaActual = -1, columnaActual = -1;
        for (int i = 0; i < numFilas; i++) {
            for (int j = 0; j < numColumnas; j++) {
                if (cuadricula[i][j] == 'B') {
                    filaActual = i;
                    columnaActual = j;
                    break;
                }
            }
        }

        int nuevaFila = filaActual, nuevaColumna = columnaActual;
        switch (direccion) {
            case 0: //Arriba
                nuevaFila--;
                break;
            case 1: //Derecha
                nuevaColumna++;
                break;
            case 2: //Abajo
                nuevaFila++;
                break;
            case 3: //Izquierda
                nuevaColumna--;
                break;
        }

        if (nuevaFila >= 0 && nuevaFila < numFilas && nuevaColumna >= 0 && nuevaColumna < numColumnas && cuadricula[nuevaFila][nuevaColumna] == 'A') {
            cuadricula[filaActual][columnaActual] = 'A';
            cuadricula[nuevaFila][nuevaColumna] = 'B';
        } else {
            System.out.println("No se puede mover el barco en esa dirección");
        }
    }

    public boolean disparar(int fila, int columna){
        fila--;
        columna--;
        if (fila < 0 || fila >= numFilas || columna < 0 || columna >= numColumnas){
            System.out.println("Posición fuera de la cuadricula");
            return false;
        } else if (cuadricula[fila][columna] == 'B') {
            cuadricula[fila][columna] = 'X';
            System.out.println("¡Barco hundido!");
            return true;
        } else {
            System.out.println("Disparo fallido");
            return false;
        }
    }


}
