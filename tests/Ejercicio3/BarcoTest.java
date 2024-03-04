package Ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

class BarcoTest {

    @org.junit.jupiter.api.Test
    void getTamano() {
        Barco barco = new Barco(3, new Cuadricula(), 3, 3);
        assertEquals(3, barco.getTamano());
    }

    @org.junit.jupiter.api.Test
    void isGolpeado() {
        Barco barco = new Barco(3, new Cuadricula(), 3, 3);
        assertEquals(false, barco.isGolpeado());
    }

    @org.junit.jupiter.api.Test
    void golpear() {
        Barco barco = new Barco(3, new Cuadricula(), 3, 3);
        barco.golpear();
        assertEquals(true, barco.isGolpeado());
    }

    @org.junit.jupiter.api.Test
    void moverBarco() {
        Barco barco = new Barco(3, new Cuadricula(), 3, 3);
        barco.moverBarco();
        assertEquals(true, barco.isGolpeado());
    }

}