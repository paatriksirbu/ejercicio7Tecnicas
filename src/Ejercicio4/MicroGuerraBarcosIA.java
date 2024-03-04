package Ejercicio4;

import java.util.Scanner;

public class MicroGuerraBarcosIA {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //Creamos tablero y lo mostramos
        System.out.println("Tablero inicial");
        Cuadricula cuadricula = new Cuadricula();
        Cuadricula cuadriculaComputadora = new Cuadricula();
        Cuadricula.mostrarTablero(cuadricula);

        //Creamos un barco y lo depositamos en el tablero
        System.out.println("\nTablero con barco");
        Barco barco = new Barco(3, cuadricula, 0, 0);
        Barco barcoComputadora = new Barco(3, cuadriculaComputadora, 0, 0);
        cuadricula.depositarBarco(3, 3, barco);
        Cuadricula.mostrarTablero(cuadricula);  //Mostramos el tablero con el barco depositado


        //Creamos un jugador y le asignamos un barco y un tablero
        Jugador jugadorUsuario = new Jugador(barco, cuadricula);
        Jugador jugadorComputadora = new Jugador(barcoComputadora, cuadriculaComputadora);

        while(true){    //Bucle que mueve el barco por el tablero simulando que hay corrientes marinas. Se mueve cada 2 segundos.
            barco.moverBarco();
            Cuadricula.mostrarTablero(cuadricula);
            Thread.sleep(2500);

            System.out.println("Turno del usuario.");
            System.out.println("Ingresa la fila y columna donde quieres disparar.");
            int fila = sc.nextInt();
            int columna = sc.nextInt();
            boolean hundido = barcoComputadora.disparar(fila, columna);

            if (hundido){
                System.out.println("¡El usuario ha conseguido hundir el barco!");
                break;
            }

            System.out.println("Turno de la computadora.");
            if (jugadorComputadora.estaRastreandoBarco()) {
                // Si la computadora está rastreando un barco, dispara a una celda adyacente
                fila = jugadorComputadora.getUltimaFilaExitosa() + (int) (Math.random() * 3) - 1;
                columna = jugadorComputadora.getUltimaColumnaExitosa() + (int) (Math.random() * 3) - 1;
            } else {
                // Si la computadora no está rastreando un barco, dispara a una celda aleatoria
                fila = (int) (Math.random() * 10 + 1);
                columna = (int) (Math.random() * 10 + 1);
            }
            hundido = jugadorUsuario.disparar(fila, columna);

            if (hundido){
                System.out.println("¡La computadora ha conseguido hundir el barco!");
                break;
            }


        }
    }
}
