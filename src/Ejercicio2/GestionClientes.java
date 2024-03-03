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
            System.out.println("¿Desea añadir otro cliente? (s/n)");
            Scanner sc = new Scanner(System.in);
            respuesta = sc.nextLine();
        } while (respuesta.equals("s"));


        // Crear libros
        ArrayList<Libro> libros = crearLibros();


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
