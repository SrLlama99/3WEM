package procesosSimples.EjercicioLaboratorioFiles;

import java.io.*;

public class AnalizarOrina {
    public static void main(String[] args) {
        File leer = new File(args[0]);
        File escr = new File("EjercicioLaboratorioFiles/resultado.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(leer));
            BufferedWriter bw = new BufferedWriter(new FileWriter(escr, true));
            String entrada = br.readLine();
            String[] datos = entrada.split(";");

            double leucocitos = Double.parseDouble(datos[0].trim());
            double pH = Double.parseDouble(datos[1].trim());

            if (leucocitos < 0 || leucocitos > 5){
                bw.write("Leucocitos: FUERA DE RANGO");
                bw.newLine();
            } else {
                bw.write("Leucocitos: OK");
                bw.newLine();
            }

            if (pH < 4.5 || pH > 8){
                bw.write("pH: FUERA DE RANGO");
                bw.newLine();
            } else {
                bw.write("pH: OK");
                bw.newLine();
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
