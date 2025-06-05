package data_structures.my_hashMap_realization;


public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final int DEFAULT_SIZE = 0;

    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private final float loadFactor;
    private int size;

    private Node<K, V>[] buckets;

    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        loadFactor = DEFAULT_LOAD_FACTOR;
        size = DEFAULT_SIZE;
    }

    private int getBucketIndex(K key) {
        if (key == null) return 0;
        return Math.abs(key.hashCode() % buckets.length);
    }

    private void resize() {
        Node<K,V>[] oldBuckets = buckets;
        buckets = new Node[oldBuckets.length * 2];
        size = 0;
        for (Node<K, V> oldNode : oldBuckets) {
            while (oldNode != null) {
                Node<K, V> next = oldNode.next;

                int newIndex = getBucketIndex(oldNode.key);

                oldNode.next = buckets[newIndex];
                buckets[newIndex] = oldNode;
                oldNode = next;
                size++;
            }
        }
    }

    @Override
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        if (size > buckets.length * loadFactor){
            resize();
        }

        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }
        buckets[index] = new Node<>(key, value, buckets[index]);
        size++;
    }

    @Override
    public V remove(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];

        if (current == null) {
            return null;
        }

        if (current.key.equals(key)) {
            V removedValue = current.value;
            buckets[index] = current.next;
            size--;
            return removedValue;
        }
        Node<K, V> prev = current;
        current = current.next;

        while (current != null) {
            if (current.key.equals(key)) {
                prev.next = current.next;
                size--;
                return current.value;
            }

            prev = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        int index = getBucketIndex(key);
        Node<K, V> current = buckets[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    static class Node<K, V> implements MyMap.Entry<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public K getKey() {
            return key;
        }
    }

}
