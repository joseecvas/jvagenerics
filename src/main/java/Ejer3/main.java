package Ejer3;

public class main {
    public static void main(String[] args) {
        MatrizGenérica m = new MatrizGenérica(4, 2);
        int e=1;
        for(int i = 0;i<m.getFilas();i++){
            for(int j = 0;j<m.getFilas();j++){
                m.[i][j] = e;
                e++;
            }
        }
    }
}
