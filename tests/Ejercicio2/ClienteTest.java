package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @org.junit.jupiter.api.Test
    void agregarLibroInteresante() {
        Cliente cliente = new Cliente("Juan", "Perez", 25, "Novela");
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien",  "Novela");
        cliente.agregarLibroInteresante(libro);
        assertEquals(1, cliente.getLibrosInteresantes().size());
    }

    @org.junit.jupiter.api.Test
    void agregarLibroComprado() {
        Cliente cliente = new Cliente("Juan", "Perez", 25, "Novela");
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", "Novela");
        cliente.agregarLibroComprado(libro);
        assertEquals(1, cliente.getHistorialCompras().size());
    }


}