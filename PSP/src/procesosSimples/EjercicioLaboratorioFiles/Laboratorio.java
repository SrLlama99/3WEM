package procesosSimples.EjercicioLaboratorioFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Laboratorio {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File escr = new File("EjercicioLaboratorioFiles/resultado.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(escr, true));
            System.out.println("Escribe el nombre del paciente: ");
            String nombre = sc.nextLine();

            bw.write("Informe de " + nombre);
            bw.newLine();
            bw.write("==========");
            bw.newLine();

            bw.close();

            System.out.println("Introduce un archivo:");
            String archivo = sc.nextLine();

            ProcessBuilder pbOrina = new ProcessBuilder("java.exe",
                    "-cp",
                    "out/production/PSP",
                    "procesosSimples.EjercicioLaboratorioFiles.AnalizarOrina",
                    archivo);

            ProcessBuilder pbSangre= new ProcessBuilder("java.exe",
                    "-cp",
                    "out/production/PSP",
                    "procesosSimples.EjercicioLaboratorioFiles.AnalizarSangre",
                    archivo);

            pbOrina.start();
            pbSangre.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
