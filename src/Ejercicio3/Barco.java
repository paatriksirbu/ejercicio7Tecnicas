package Ejercicio3;

import java.util.Random;

public class Barco implements IntBarco{
    private int tamano;
    private boolean golpeado;
    private Cuadricula cuadricula;
    private int filaActual;
    private int columnaActual;


    public Barco(int taman, Cuadricula cuadricula, int filaInicial, int columnaInicial) {
        this.tamano = tamano;
        this.golpeado = false;
        this.cuadricula = cuadricula;
        this.filaActual = filaInicial;
        this.columnaActual = columnaInicial;
    }

    public int getTamano() {
        return tamano;
    }

    public boolean isGolpeado() {
        return golpeado;
    }

    public void golpear() {
        this.golpeado = true;
    }

    //Creamos un metodo que haga que el barco se mueva segun la situacion ambiental. Entendiendo que puede haber viento y corrientes marinas,
    //el barco se podra mover aleatoriamente en cualquier direccion (arriba, abajo, izquierda, derecha), siempre en posiciones adyacentes..
    public void moverBarco(){
        Random random = new Random();
        int direccion = random.nextInt(4);

        int filaActual = -1, columnaActual = -1;
        for (int i = 0; i < cuadricula.getNumFilas(); i++) {
            for (int j = 0; j < cuadricula.getNumColumnas(); j++) {
                if (cuadricula.getCuadricula()[i][j] == 'B') {
                    filaActual = i;
                    columnaActual = j;
                    break;
                }
            }
        }

        int nuevaFila = filaActual, nuevaColumna = columnaActual;
        do{
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
        } while(nuevaFila < 0 || nuevaFila >= cuadricula.getNumFilas() || nuevaColumna < 0 || nuevaColumna >= cuadricula.getNumColumnas() || cuadricula.getCuadricula()[nuevaFila][nuevaColumna] != 'A');

        cuadricula.getCuadricula()[filaActual][columnaActual] = 'A';
        cuadricula.getCuadricula()[nuevaFila][nuevaColumna] = 'B';

    }

    public boolean disparar(int fila, int columna){
        fila--;
        columna--;
        if (fila < 0 || fila >= cuadricula.getNumFilas() || columna < 0 || columna >= cuadricula.getNumColumnas()){
            System.out.println("Posición fuera de la cuadricula");
            return false;
        } else if (cuadricula.getCuadricula()[fila][columna] == 'B') {
            cuadricula.getCuadricula()[fila][columna] = 'X';
            System.out.println("¡Barco hundido!");
            return true;
        } else {
            System.out.println("Disparo fallido");
            return false;
        }
    }




}
