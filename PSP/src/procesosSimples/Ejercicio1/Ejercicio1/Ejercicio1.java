package procesosSimples.Ejercicio1.Ejercicio1;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "start msedge https://www.youtube.com/watch?v=eBGIQ7ZuuiU");
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        String[] opciones = {"piedra", "papel", "tijeras"};

        try{
            String eleccion = sc.nextLine().toLowerCase();
            String ia = opciones[ran.nextInt(3)];

            System.out.println("La consola eligió: " + ia);

            if (eleccion.equals(ia)) {
                System.out.println("¡Empate!");
            } else if ((eleccion.equals("piedra") && ia.equals("tijeras")) ||
                    (eleccion.equals("papel") && ia.equals("piedra")) ||
                    (eleccion.equals("tijeras") && ia.equals("papel"))) {
                System.out.println("¡Ganaste! :)");
                pb.start();
            } else {
                System.out.println("¡Perdiste! :(");
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
