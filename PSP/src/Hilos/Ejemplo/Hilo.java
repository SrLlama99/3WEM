package Hilos.Ejemplo;

public class Hilo extends Thread{
    @Override
    public void run(){
        System.out.println("Hola desde el hilo hijo");
    }
}
