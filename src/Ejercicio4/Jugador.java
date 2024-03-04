package Ejercicio4;

public class Jugador {
    private Barco barco;
    private Cuadricula cuadricula;
    private int ultimaFilaExitosa;
    private int ultimaColumnaExitosa;
    private boolean rastreandoBarco;

    public Jugador(Barco barco, Cuadricula cuadricula){
        this.barco = barco;
        this.cuadricula = cuadricula;
        this.rastreandoBarco = false;
    }

    public boolean disparar(int fila, int columna){
        boolean hundido = barco.disparar(fila, columna);
        if (hundido){
            ultimaFilaExitosa = fila;
            ultimaColumnaExitosa = columna;
            rastreandoBarco = true;
        }
        return hundido;
    }

    // Getters
    public int getUltimaFilaExitosa() {
        return ultimaFilaExitosa;
    }

    public int getUltimaColumnaExitosa() {
        return ultimaColumnaExitosa;
    }

    //Boolean que indica si la computadora está rastreando un barco

    public boolean estaRastreandoBarco(){
        return rastreandoBarco;
    }
}
