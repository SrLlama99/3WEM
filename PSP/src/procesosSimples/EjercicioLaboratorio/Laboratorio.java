package procesosSimples.EjercicioLaboratorio;

import java.io.IOException;
import java.util.Scanner;

public class Laboratorio {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String nombre = sc.nextLine();

        ProcessBuilder pbSangre = new ProcessBuilder("java.exe",
                "-cp",
                "out/production/PSP",
                "procesosSimples.EjercicioLaboratorio.AnalizaSangre");

        ProcessBuilder pbOrina = new ProcessBuilder("java.exe",
                "-cp",
                "out/production/PSP",
                "procesosSimples.EjercicioLaboratorio.AnalizaOrina");


        try{
            int resSangre = pbSangre.start().waitFor();
            int resOrina = pbOrina.start().waitFor();

            System.out.println("Nombre del paciente: " + nombre);
            System.out.println("Analisis completado");

            if(resSangre == 0){
                System.out.println("Valores de sangre: OK");
            }else {
                System.out.println("Valores de sangre: Fuera de rango");
            }

            if(resOrina == 0){
                System.out.println("Valores de orina: OK");
            }else{
                System.out.println("Valores de la orina: Fuera de rango");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
