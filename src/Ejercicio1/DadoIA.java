package Ejercicio1;
import java.util.*;
public class DadoIA {
    int caras;
    private Random random;
    private HashMap<Integer, Integer> historialResultados;

    public DadoIA(int caras) {  //Creamos un constructor que recibe el numero de caras del dado
        this.caras = caras;
        random = new Random();
        this.historialResultados = new HashMap<>(); //Creamos un HashMap para guardar el historial de resultados
        for (int i = 1; i <= caras; i++) {  //Inicializamos el historial de resultados con 0
            this.historialResultados.put(i, 0);
        }
    }


    public int lanzarDado () throws IllegalArgumentException {  //Creamos un metodo que simula el lanzamiento del dado donde las caras solo pueden estar entre 1 y 6.
        int resultado = random.nextInt(caras) + 1;  //Generamos un numero aleatorio entre 1 y el numero de caras del dado
        return resultado;
    }

    public void actualizarHistorial(int resultado) {
        historialResultados.put(resultado, historialResultados.get(resultado) + 1);
    }

    public double predecir(int cara){   //Para predecir el resultado de un dado, calculamos la probabilidad de que salga una cara en especifico
        int totalLanzamientos = 0;
        for(Integer valor : historialResultados.values()){
            totalLanzamientos += valor;
        }
        if(totalLanzamientos > 0){
            return (double)historialResultados.get(cara) / totalLanzamientos;
        } else {
            return 0;
        }
    }

    public void mostrarHistorialResultados(){   //Mostramos el historial de resultados mostrando la cara y el numero de veces que ha salido
        for (int i = 1; i <= caras; i++) {
            System.out.println("Cara " + i + ": " + historialResultados.get(i));
        }
    }

}
