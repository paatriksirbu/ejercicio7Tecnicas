package Ejercicio3;
import java.util.Scanner;

public class MicroGuerraBarcos {
    public static void main(String[] args) throws InterruptedException {

        //Creamos tablero y lo mostramos
        System.out.println("Tablero inicial");
        Cuadricula cuadricula = new Cuadricula();
        Cuadricula.mostrarTablero(cuadricula);

        //Creamos un barco y lo depositamos en el tablero
        System.out.println("\nTablero con barco");
        Barco barco = new Barco(3, cuadricula, 3, 3);
        cuadricula.depositarBarco(3, 3, barco);
        Cuadricula.mostrarTablero(cuadricula);

        while(true){    //Bucle que mueve el barco por el tablero simulando que hay corrientes marinas. Se mueve cada 2 segundos.
            barco.moverBarco();
            Cuadricula.mostrarTablero(cuadricula);
            Thread.sleep(2500);

            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca la fila para disparar: ");
            int fila = sc.nextInt();
            System.out.println("Introduzca la columna para disparar: ");
            int columna = sc.nextInt();
            boolean hundido = barco.disparar(fila, columna);

            if (hundido){
               System.out.println("¡Has conseguido hundir el barco!");
               break;
            }
        }
    }
}
