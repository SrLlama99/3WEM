package procesosSimples.Ejercicio1.Ejercicio3;

import java.io.IOException;

public class InformarGanador {
    static void main() {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/c", "start msedge https://www.youtube.com/watch?v=eBGIQ7ZuuiU");
        System.out.println("HAS GANADOOOOOOOO!!!!!!!! FELICIDADEEEEEEEEEEEEEEEEES!!!!");

        try{
            pb.start();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
