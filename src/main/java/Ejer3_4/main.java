package Ejer3_4;

public class main {
    public static void main(String[] args) {
        MatrizGenérica m = new MatrizGenérica(4, 2);
        int e=1;
        for(int i = 0;i<m.getFilas();i++){
            for(int j = 0;j<m.getColumnas();j++){
                m.set(i, j, e);
                e++;
            }
        }
        System.out.println(m.toString());
        System.out.println(m.get(0, 1));
    }
}
