package procesosSimples.EjercicioLaboratorio;

public class AnalizaOrina {
    static void main() {
        try {
            int tiempo = (int) (Math.random() * 5000) + 1000;
            Thread.sleep(tiempo);


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int res = (int) (Math.random() * 2);
        System.exit(res);
    }
}
