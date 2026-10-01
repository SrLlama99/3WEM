package procesosSimples;

import java.io.IOException;

public class LanzarProceso {
    static void main(){
        ProcessBuilder pb = new ProcessBuilder("java.exe",
                    "-cp",
                    "out/production/procesosSimples",
                    "Pruebita");
        try{
            pb.start();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
