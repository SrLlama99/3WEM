package Paquete1.Ejercicio2;

import java.util.Objects;

public class Coches {
    String matricula;
    int ruedas;

    public Coches(String matricula, int ruedas) {
        this.matricula = matricula;
        this.ruedas = ruedas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coches coches = (Coches) o;
        return Objects.equals(matricula, coches.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }

    @Override
    public String toString(){
        return matricula + " " + ruedas;
    }
}
