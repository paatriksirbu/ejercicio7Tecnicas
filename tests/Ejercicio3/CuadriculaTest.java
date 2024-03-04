package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

class CuadriculaTest {

    @org.junit.jupiter.api.Test
    void mostrarTablero() {
        Cuadricula cuadricula = new Cuadricula();
        Cuadricula.mostrarTablero(cuadricula);
    }


}