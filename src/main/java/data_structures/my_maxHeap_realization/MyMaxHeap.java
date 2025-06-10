package data_structures.my_maxHeap_realization;

public interface MyMaxHeap {
    void insert(int element);
    int extractMax();
    int size();
    boolean isEmpty();
    int peekMax();
}
