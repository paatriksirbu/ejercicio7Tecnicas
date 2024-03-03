package Ejercicio2;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public ArrayList<Libro> ofrecerRecomendaciones(ArrayList<Libro> todosLosLibros, boolean incluirSimilares) {
        ArrayList<Libro> recomendaciones = new ArrayList<>();
        for (Libro libro : todosLosLibros) {
            if (libro.getCategoria().equals(intereses) && !historialCompras.contains(libro)) {
                recomendaciones.add(libro);
            }
        }
        if (incluirSimilares && recomendaciones.size() < 5) { // Si hay menos de 5 recomendaciones
            List<String> categoriasSimilaresAIntereses = categoriasSimilares.get(intereses);
            if (categoriasSimilaresAIntereses != null) {
                for (Libro libro : todosLosLibros) {
                    if (categoriasSimilaresAIntereses.contains(libro.getCategoria()) && !historialCompras.contains(libro) && !recomendaciones.contains(libro)) {
                        recomendaciones.add(libro);
                        if (recomendaciones.size() >= 5) { // Si ya hay 5 o más recomendaciones
                            break;
                        }
                    }
                }
            }
        }

        return recomendaciones;
    }
    boolean incluirSimilares;


    private static Map<String, List<String>> categoriasSimilares = new HashMap<>();
    static {
        categoriasSimilares.put("Fantasía", Arrays.asList("Ciencia ficción", "Aventura"));
        categoriasSimilares.put("Misterio", Arrays.asList("Thriller", "Suspense"));
        categoriasSimilares.put("Infantil", Arrays.asList("Autoayuda"));
        categoriasSimilares.put("Autoayuda", Arrays.asList("Infantil"));
        categoriasSimilares.put("Clásico", Arrays.asList("Realismo mágico", "Romance"));
        categoriasSimilares.put("Realismo mágico", Arrays.asList("Clásico", "Romance"));
        categoriasSimilares.put("Distopía", Arrays.asList("Terror"));
        categoriasSimilares.put("Romance", Arrays.asList("Clásico", "Realismo mágico"));
        categoriasSimilares.put("Terror", Arrays.asList("Distopía"));
    }
    @Override
    public String toString() {
        return "Cliente: \n" + "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", intereses= " + intereses;
    }
}
