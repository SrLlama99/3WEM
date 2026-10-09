package procesosSimples.EjercicioHerramientasRed;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("CMD",
                "/C",
                "ping -n", args[0], "8.8.8.8");

        try{
            Process procesoHijo = pb.start();

            while (procesoHijo.isAlive()) {
                Thread.sleep(500);

                System.out.println("Proceso principal (" + System.currentTimeMillis() +") - Proceso hijo no ha terminado. Esperando otro medio segundo.");
            }

            int exitCode = procesoHijo.exitValue();
            if (exitCode == 0) {
                System.out.println("El proceso hijo de ping ha terminado correctamente");
            } else {
                System.out.println("El proceso hijo de ping ha terminado con código de error: " + exitCode);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
