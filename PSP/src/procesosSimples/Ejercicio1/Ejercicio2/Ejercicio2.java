package procesosSimples.Ejercicio1.Ejercicio2;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder("java.exe",
                "-cp",
                "out/production/PSP/",
                "procesosSimples.Ejercicio1.Ejercicio2.InformarGanador");
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
                pb.inheritIO();
                pb.start();
            } else {
                System.out.println("¡Perdiste! :(");
            }

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
