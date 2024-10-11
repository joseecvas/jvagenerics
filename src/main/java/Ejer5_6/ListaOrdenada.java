package Ejer5_6;

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
    public int size() {
        return lista.size ();
    }
    public E get(int index){
        return lista.get ( index );
    }
    public boolean remove(E o){
        boolean remove = false;
        for(E e : lista){
            if (e.equals ( o )){
                lista.remove ( o );
                remove = true;
            }
        }
        return remove;
    }
    public int indexOf(E o){
        return lista.indexOf ( o );
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "lista=" + lista +
                '}';
    }
}
