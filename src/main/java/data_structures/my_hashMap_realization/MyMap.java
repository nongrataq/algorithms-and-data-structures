package data_structures.my_hashMap_realization;

public interface MyMap<K, V> {
    V get(K key);
    void put(K key, V element);
    V remove(K key);
    boolean containsKey(K key);
    interface Entry<K, V> {
        V getValue();
        K getKey();
    }
    int size();
}
