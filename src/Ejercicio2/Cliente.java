package Ejercicio2;

import java.util.ArrayList;

public class Cliente {

    private String nombre, apellido;
    private int edad;
    private String intereses;
    private ArrayList<Libro> librosInteresantes = new ArrayList<>();
    private ArrayList<Libro> historialCompras = new ArrayList<>();

    public Cliente(String nombre, String apellido, int edad, String intereses) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.intereses = intereses;
        librosInteresantes = new ArrayList<>();
        historialCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getIntereses() {
        return intereses;
    }

    public ArrayList<Libro> getLibrosInteresantes() {
        return librosInteresantes;
    }

    public ArrayList<Libro> getHistorialCompras() {
        return historialCompras;
    }

    public void agregarLibroInteresante(Libro libro) {
        if (!librosInteresantes.contains(libro)) {
            librosInteresantes.add(libro);
        }
    }

    public void agregarLibroComprado(Libro libro) {
        if (!historialCompras.contains(libro)) {
            historialCompras.add(libro);
        }
    }

    public ArrayList<Libro> ofrecerRecomendaciones(ArrayList<Libro> AllBooks) {
        ArrayList<Libro> recomendaciones = new ArrayList<>();
        for (Libro libro : AllBooks) {
            if(libro.getCategoria().equals(intereses) && !librosInteresantes.contains(libro) && !historialCompras.contains(libro)){
                recomendaciones.add(libro);
            }
        }
        return recomendaciones;
    }
    @Override
    public String toString() {
        return "Cliente: \n" + "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", intereses= " + intereses;
    }
}
