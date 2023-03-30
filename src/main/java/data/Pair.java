package data;

public class Pair<K, V> {

    public final K key;
    public final V value;


    public Pair(K key, V value) {
        this.value = value;
        this.key = key;
    }
}
