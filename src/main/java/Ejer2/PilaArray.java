package Ejer2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

public class PilaArray<T> {
    public PilaArray(T[] elementos) {
        this.elementos = elementos;
    }

    private T [] elementos = null;
        private boolean estaVacia() {
            return elementos.length==0;
        }
        public void extraer() {
            System.out.println(elementos[elementos.length-1]);
            elementos = Arrays.copyOf(elementos, elementos.length-1);
        }
        public void primero(){
            System.out.println(elementos[0]);
        }
        public void añadir(T elemento){
            elementos = Arrays.copyOf(elementos, elementos.length+1);
            elementos[elementos.length-1] = elemento;
        }

        @Override
        public String toString() {
            return "Pila{" +
                    "elementos=" + Arrays.toString(elementos) +
                    '}';
        }
}
