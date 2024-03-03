package Ejercicio2;
import java.util.*;


public class GestionClientes {
    public static void main(String[] args) {
        System.out.println("Gestión de clientes con recomendaciones de libros personalizadas");

        // Crear clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        String respuesta;
        do {
            clientes.add(crearCliente());
            // Crear libros
            ArrayList<Libro> libros = crearLibros();
            System.out.println("Libros disponibles: \n");
            for (Libro libro : libros) {
                System.out.println(libro.getTitulo());
            }

            System.out.println("Introduzca el número de libros que le interesan al cliente: ");
            Scanner sc = new Scanner(System.in);
            int numLibros = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < numLibros; i++) {
                System.out.println("Introduzca el título del libro: ");
                String titulo = sc.nextLine();
                for (Libro libro : libros) {
                    if (libro.getTitulo().equals(titulo)) {
                        clientes.get(clientes.size() - 1).agregarLibroInteresante(libro);
                    }
                }
            }
            System.out.println("Ha comprado usted alguno de estos libros? (s/n)");
            respuesta = sc.nextLine();
            if (respuesta.equals("s")) {
                System.out.println("Introduzca el número de libros que ha comprado: ");
                int numLibrosComprados = sc.nextInt();
                sc.nextLine();
                for (int i = 0; i < numLibrosComprados; i++) {
                    System.out.println("Introduzca el título del libro: ");
                    String titulo = sc.nextLine();
                    for (Libro libro : libros) {
                        if (libro.getTitulo().equals(titulo)) {
                            clientes.get(clientes.size() - 1).agregarLibroComprado(libro);
                        }
                    }
                }
            }

            System.out.println("Recomendaciones para el cliente: ");
            ArrayList<Libro> recomendaciones = clientes.get(clientes.size() - 1).ofrecerRecomendaciones(libros, false);
            for (Libro libro : recomendaciones) {
                System.out.println(libro.getTitulo());
            }

            System.out.println("Quiere obtener recomendaciones similares? (s/n)");
            respuesta = sc.nextLine();
            boolean incluirSimilares = respuesta.equalsIgnoreCase("s");
            for (Libro libro : clientes.get(clientes.size() - 1).ofrecerRecomendaciones(libros, incluirSimilares)) {
                System.out.println(libro.getTitulo());
            }




            System.out.println("¿Desea añadir otro cliente? (s/n)");
            respuesta = sc.nextLine();
        } while (respuesta.equals("s"));

        System.out.println("Clientes: \n");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }




    }

    public static ArrayList<Libro> crearLibros(){
        ArrayList<Libro> libros = new ArrayList<>();
        libros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", "Fantasía"));
        libros.add(new Libro("El código Da Vinci", "Dan Brown", "Misterio"));
        libros.add(new Libro("El principito", "Antoine de Saint-Exupéry", "Infantil"));
        libros.add(new Libro("El alquimista", "Paulo Coelho", "Autoayuda"));
        libros.add(new Libro("El nombre del viento", "Patrick Rothfuss", "Fantasía"));
        libros.add(new Libro("El retrato de Dorian Gray", "Oscar Wilde", "Clásico"));
        libros.add(new Libro("El psicoanalista", "John Katzenbach", "Misterio"));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "Realismo mágico"));
        libros.add(new Libro("1984", "George Orwell", "Distopía"));
        libros.add(new Libro("Orgullo y prejuicio", "Jane Austen", "Romance"));
        libros.add(new Libro("Matar a un ruiseñor", "Harper Lee", "Clásico"));
        libros.add(new Libro("La sombra del viento", "Carlos Ruiz Zafón", "Misterio"));
        libros.add(new Libro("Frankenstein", "Mary Shelley", "Terror"));
        return libros;
    }

    public static Cliente crearCliente() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        System.out.println("Creando clientes...");
        System.out.println("Introduzca el nombre del cliente: ");
        String nombre = sc.nextLine();
        System.out.println("Introduzca el apellido del cliente: ");
        String apellido = sc.nextLine();
        System.out.println("Introduzca la edad del cliente: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca los intereses del cliente: ");
        String intereses = sc.nextLine();

        return new Cliente(nombre, apellido, edad, intereses);
    }
}
