package Ejer3_4;

public class MatrizGenérica<T> {
    private int filas;
    private int columnas;
    private T[][] matriz;

    public MatrizGenérica(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        matriz = (T[][]) new Object[filas][columnas];
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

    public String matrizToString(){
        String matriztxt = "";
        for(int i = 0;i<filas;i++){
            for (int j = 0;j<columnas;j++){
                matriztxt+=matriz[i][j]+",";
            }
        }
        return matriztxt;
    }
    @Override
    public String toString() {
        return "MatrizGenérica{" +
                "filas=" + filas +
                ", columnas=" + columnas +
                ", matriz=" + matrizToString() +
                '}';
    }
}
