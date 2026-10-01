package Paquete1.Ejercicio2;

import java.util.HashMap;

public class Ejercicio2 {
    public static void main(String[] args) {
        HashMap<String, Coches> mapaMadrid = new HashMap<>();
        HashMap<String, Coches> mapaSoria = new HashMap<>();

        mapaMadrid.put("Coche 1", new Coches("6767HHH", 4));
        mapaMadrid.put("Coche 2", new Coches("0911JFK", 2));
        mapaMadrid.put("Coche 3", new Coches("9925CHK", 3));

        System.out.println(mapaMadrid);
        System.out.println(mapaSoria);

        mapaSoria.putAll(mapaMadrid);
        System.out.println(mapaSoria);
    }
}
