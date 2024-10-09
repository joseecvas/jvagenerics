package Ejer3;

import java.util.Arrays;

public class MatrizGenérica<T> {
    private int filas;
    private int columnas;
    private T[][] matriz;
    public MatrizGenérica(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = new T[2][4];
    }
    public void set(int fila, int columna, T elemento){
        matriz[fila][columna] = elemento;
    }
    public T get(int fila, int columna){
        return matriz[fila][columna];
    }

    public int getColumnas() {
        return columnas;
    }

    public int getFilas() {
        return filas;
    }

    @Override
    public String toString() {
        return "MatrizGenérica{" +
                "filas=" + filas +
                ", columnas=" + columnas +
                ", matriz=" + Arrays.toString(matriz) +
                '}';
    }
}
