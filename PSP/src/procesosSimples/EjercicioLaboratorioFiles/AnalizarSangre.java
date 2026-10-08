package procesosSimples.EjercicioLaboratorioFiles;

import java.io.*;

public class AnalizarSangre {
    static void main(String[] args) {
        File leer = new File(args[0]);
        File escr = new File("EjercicioLaboratorioFiles/resultado.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(leer));
            BufferedWriter bw = new BufferedWriter(new FileWriter(escr, true));
            String entrada = br.readLine();
            String[] datos = entrada.split(";");

            double glucosa = Double.parseDouble(datos[2].trim());
            double colesterol = Double.parseDouble(datos[3].trim());
            double hemoglobina = Double.parseDouble(datos[4].trim());

            if (glucosa < 70 || glucosa > 100){
                bw.write("Glucosa: FUERA DE RANGO");
                bw.newLine();
            } else {
                bw.write("Glucosa: OK");
                bw.newLine();
            }

            if (colesterol < 200){
                bw.write("Colesterol: OK");
                bw.newLine();
            } else {
                bw.write("Colesterol: FUERA DE RANGO");
                bw.newLine();
            }

            if (hemoglobina < 13 || hemoglobina > 17) {
                bw.write("Hemoglobina: FUERA DE RANGO");
                bw.newLine();
            }else {
                bw.write("Hemoglobina: OK");
            }

            bw.close();
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
