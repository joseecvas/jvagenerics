package practica;

public class Util {
//    public static boolean equals(Par<String, Integer> par1, Par<String, Integer> par2){
//        return par1.getValue().equals(par2.getValue()) && par1.getKey().equals(par2.getKey());
//    }
    public static <K,V> boolean equals(Par<K,V> par1, Par<K,V> par2){
        return par1.getValue().equals(par2.getValue()) && par1.getKey().equals(par2.getKey());
    }
    public static int obtener(Integer entrada){
        return entrada;
    }
    public static int obtener(String entrada){
        return entrada.length();
    }

    public static void main(String[] args) {
        Par<Integer, String> par1 = new ParImpl<>(1, "Jose");
        Par<Integer, String> par2 = new ParImpl<>(2, "Jose");
        boolean iguales = Util.equals(par1, par2);
        System.out.println(iguales);
        Par<String, Integer> parStrInt1 = new ParImpl<>("Jose", 20);
        Par<String, Integer> parStrInt2 = new ParImpl<>("Jose", 20);
        boolean iguales2 = Util.<String, Integer>equals(parStrInt1, parStrInt2);

    }
}
