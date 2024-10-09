package practica;

public class ParImpl<K,V> implements Par<K,V>{
    private K key;
    private V value;
    public ParImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    @Override
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Par<String,Integer> parStrInt = new ParImpl<>("Jose",20);
        System.out.printf(parStrInt.getKey());
    }
}
