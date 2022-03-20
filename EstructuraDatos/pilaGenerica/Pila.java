package pilaGenerica;

import java.util.ArrayList;

public class Pila<T> {
    //private char pila[];
    private ArrayList<T> pila;
    private int tope;  //top
    private int capacidad;

    public Pila(int capacidad) {
        //pila = new char[capacidad];
        this.capacidad = capacidad;
    }
    public void push(T i) {
        if (pila.size () < this.capacidad){
            //pila[++tope] = i;
            pila.add(i);
        }
    }
    public T pop() {
        if (!isEmpty()) {
            return pila.remove(pila.size() - 1);
        } else {
            return null;
        }
    }
    public boolean isEmpty() {
        return pila.isEmpty ();
    }
}