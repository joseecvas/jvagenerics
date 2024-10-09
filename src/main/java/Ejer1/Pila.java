package Ejer1;

import java.util.LinkedList;

public class Pila <T>{
    private LinkedList <T> elementos = new LinkedList<>();
    private boolean estaVacia() {
        return elementos.isEmpty();
    }
    public void extraer() {
        System.out.println(elementos.getFirst());
        elementos.remove(elementos.getFirst());
    }
    public void primero(){
        System.out.println(elementos.getFirst());
    }
    public void añadir(T elemento){
        elementos.add(elemento);
    }

    @Override
    public String toString() {
        return "Pila{" +
                "elementos=" + elementos +
                '}';
    }
}
