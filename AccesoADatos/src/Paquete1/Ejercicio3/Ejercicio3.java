package Paquete1.Ejercicio3;

import javax.swing.*;

class Nodo<E>{
    private E dato;
    private Nodo<E> sig;
    Nodo(E dato) {
        this.dato = dato;
    }

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public Nodo<E> getSig() {
        return sig;
    }

    public void setSig(Nodo<E> sig) {
        this.sig = sig;
    }
}

interface ICharlieKirk<E> {
    public void tiroAlCuello(E elemento);
    public void weAreCharlieKirk();
    public boolean charlieKirkHaMuerto(E elemento);
}

class Coleccion<E> implements ICharlieKirk<E> {
    private Nodo<E> primero;

    private boolean duplicados(E elemento){
        Nodo<E> actual = primero;
        while (actual != null){
            if(actual.getDato().equals(elemento)){
                return true;
            }
            actual = actual.getSig();
        }

        return false;
    }

    @Override
    public void tiroAlCuello(E elemento){
        if(duplicados(elemento)){
            return;
        }
        Nodo<E> nuevo = new Nodo<>(elemento);
        if (primero == null){
            primero = nuevo;
        } else {
            Nodo<E> actual = primero;
            while(actual.getSig() != null) {
                actual = actual.getSig();
            }
            actual.setSig(nuevo);
        }
    }

    @Override
    public void weAreCharlieKirk() {
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        Nodo<E> actual = primero;
        String resultado = "";
        while (actual != null){
            resultado += actual.getDato();
            if(actual.getSig() != null){
                resultado += ",";
            }
            actual = actual.getSig();
        }
        return resultado;
    }

    @Override
    public boolean charlieKirkHaMuerto(E elemento) {
        if (primero == null) {
            return false;
        }

        if (primero.getDato().equals(elemento)) {
            primero = primero.getSig();
            return true;
        }

        Nodo<E> anterior = primero;
        Nodo<E> actual = primero.getSig();

        while (actual != null) {
            if (actual.getDato().equals(elemento)) {
                anterior.setSig(actual.getSig());
                return true;
            }
            anterior = actual;
            actual = actual.getSig();
        }
        return false;
    }
}

public class Ejercicio3 {
    static void main(String[] args){
        ICharlieKirk<String> coleccion = new Coleccion<>();
        coleccion.tiroAlCuello("pene");
        coleccion.tiroAlCuello("pene");
        coleccion.tiroAlCuello("polla");
        coleccion.weAreCharlieKirk("polla");
    }
}
