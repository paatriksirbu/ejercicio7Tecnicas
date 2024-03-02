package Ejercicio1;

public class SimuladorDados {
    public static void main(String[] args) {
        DadoIA dado1 = new DadoIA(6);
        DadoIA dado2 = new DadoIA(10);
        DadoIA dado3 = new DadoIA(12);

        int sumaDados = dado1.lanzarDado() + dado2.lanzarDado() + dado3.lanzarDado();

        do{ //Simulamos el lanzamiento de los dados hasta que la suma de los resultados sea mayor o igual a 20
            int resultado1 = dado1.lanzarDado();
            int resultado2 = dado2.lanzarDado();
            int resultado3 = dado3.lanzarDado();

            dado1.actualizarHistorial(resultado1);
            dado2.actualizarHistorial(resultado2);
            dado3.actualizarHistorial(resultado3);

            sumaDados = resultado1 + resultado2 + resultado3;
            //Mostramos los resultados de los lanzamientos y la probabilidad de obtener un 1 en cada dado
            System.out.println("Dado 1: " + resultado1);
            System.out.println("Dado 2: " + resultado2);
            System.out.println("Dado 3: " + resultado3);
            System.out.println("Suma: " + sumaDados + "\n");
            System.out.println("Probabilidad de obtener un 1 en el dado 1: " + dado1.predecir(1));
            System.out.println("Probabilidad de obtener un 1 en el dado 2: " + dado2.predecir(1));
            System.out.println("Probabilidad de obtener un 1 en el dado 3: " + dado3.predecir(1) + "\n");

            mostrarHistorialResultados(dado1, dado2, dado3);    //Mostramos el historial de resultados de los dados

        } while (sumaDados < 20);

    }

    public static void mostrarHistorialResultados(DadoIA dado1, DadoIA dado2, DadoIA dado3){    //Mostramos el historial de caras de los dados llamando al metodo mostrarHistorialResultados de cada dado
        dado1.mostrarHistorialResultados();
        dado2.mostrarHistorialResultados();
        dado3.mostrarHistorialResultados();
    }
}