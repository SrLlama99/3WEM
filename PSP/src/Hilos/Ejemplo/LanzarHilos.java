package Hilos.Ejemplo;

public class LanzarHilos {
    static void main() {
        System.out.println("Hola desde el hilo principal");

        Hilo t = new Hilo();
        t.start();
    }
}
