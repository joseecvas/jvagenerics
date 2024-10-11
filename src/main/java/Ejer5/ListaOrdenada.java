package Ejer5;

import java.util.ArrayList;
import java.util.List;

public abstract class ListaOrdenada<E extends Comparable<E>> implements ColeccionSimpleGenerica{
    private List<E> lista;
    public ListaOrdenada() {
        lista = new ArrayList<E>();
    }

    @Override
    public boolean estaVacia() {
        return lista.isEmpty();
    }

    @Override
    public void extraer() {
        System.out.println(primero());
        lista.remove(primero());
    }

    @Override
    public E primero() {
        return lista.get(0);
    }
    public void añadir(E elemento) {
        int index = 0;
        while (index < lista.size() && elemento.compareTo(lista.get(index)) > 0) {
            index++;
        }
        lista.add(index, elemento);
    }

}
