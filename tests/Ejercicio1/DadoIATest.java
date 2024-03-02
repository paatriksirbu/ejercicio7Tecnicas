package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

class DadoIATest {

    @org.junit.jupiter.api.Test
    void lanzarDado() {
        DadoIA dado = new DadoIA(6);
        int resultado = dado.lanzarDado();
        assertTrue(resultado >= 1 && resultado <= 6);
    }

    @org.junit.jupiter.api.Test
    void actualizarHistorial() {
        DadoIA dado = new DadoIA(6);
        dado.actualizarHistorial(1);
        assertEquals(1, dado.getHistorialResultados(1));
    }

    @org.junit.jupiter.api.Test
    void predecir() {
        DadoIA dado = new DadoIA(6);
        dado.actualizarHistorial(1);
        assertEquals(1, dado.predecir(1));
    }

    @org.junit.jupiter.api.Test
    void mostrarHistorialResultados() {
        DadoIA dado = new DadoIA(6);
        dado.actualizarHistorial(1);
        dado.mostrarHistorialResultados();
    }

}