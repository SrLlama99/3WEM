package Paquete1.Ejercicio1;

import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {
        ArrayList<Coches> a = new ArrayList<>();
        ArrayList<Coches> b = new ArrayList<>();

        Coches coche1 = new Coches("0911JFK", 4);
        Coches coche2 = new Coches("6767HHH", 2);

        a.add(coche1);
        a.add(coche2);
        b.add(coche1);

        System.out.println(a);
        a.removeAll(b);
        System.out.println(a);
    }
}
