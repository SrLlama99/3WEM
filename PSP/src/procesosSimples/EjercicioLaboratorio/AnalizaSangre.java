package procesosSimples.EjercicioLaboratorio;

import java.util.Random;

public class AnalizaSangre {
    static void main() {

        try {
            int tiempo = (int) (Math.random() * 5000) + 1000;
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
        int res = (int) (Math.random() * 2);
        System.exit(res);
    }
}
