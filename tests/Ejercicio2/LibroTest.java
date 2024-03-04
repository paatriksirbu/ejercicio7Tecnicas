package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @org.junit.jupiter.api.Test
    void getTitulo() {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien",  "Novela");
        assertEquals("El señor de los anillos", libro.getTitulo());
    }

    @org.junit.jupiter.api.Test
    void getAutor() {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien",  "Novela");
        assertEquals("J.R.R. Tolkien", libro.getAutor());
    }

    @org.junit.jupiter.api.Test
    void getCategoria() {
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien",  "Novela");
        assertEquals("Novela", libro.getCategoria());
    }

}