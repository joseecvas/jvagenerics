package Ejer5;

public interface ColeccionSimpleGenerica<E> {
    public boolean estaVacia();
    public void extraer();
    public E primero();
    public void añadir();
}