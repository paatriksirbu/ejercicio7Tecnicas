package Ejercicio3;

public class Barco {
    private int tamano;
    private boolean golpeado;

    public Barco(int tamano) {
        this.tamano = tamano;
        this.golpeado = false;
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

}
