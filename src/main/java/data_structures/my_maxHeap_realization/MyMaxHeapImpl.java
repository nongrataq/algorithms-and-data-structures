package data_structures.my_maxHeap_realization;

import java.util.Arrays;

public class MyMaxHeapImpl implements MyMaxHeap {
    private int[] heap;
    private int capacity;
    private int size;

    public MyMaxHeapImpl(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public MyMaxHeapImpl(int[] array) {
        this.capacity = array.length * 2;
        this.heap = new int[capacity];
        this.size = array.length;
        System.arraycopy(array, 0, heap, 0, array.length);
        buildHeap();
    }

    private void buildHeap() {
        for (int i = size / 2 - 1; i >= 0; i--) {
            siftDown(i);
        }
    }

    private int getParentIndex(int index){
        return (index - 1) / 2;
    }

    private void increaseCapacity() {
        this.capacity = this.capacity * 2;
        heap = Arrays.copyOf(heap, capacity);
    }

    private void swap(int index1, int index2){
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    private int getLeftChildIndex(int index){
        return 2 * index + 1;
    }

    private int getRightChildIndex(int index){
        return 2 * index + 2;
    }

    @Override
    public void insert(int element) {
        if (size == capacity) {
            increaseCapacity();
        }

        heap[size] = element;
        siftUp(size);
        size++;
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = getParentIndex(index);
            if (heap[index] <= heap[parent]) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void siftDown(int index) {
        int parent = index;
        int r = getRightChildIndex(index);
        int l = getLeftChildIndex(index);

        if (l < size && heap[parent] < heap[l]) {
            parent = l;
        }

        if (r < size && heap[parent] < heap[r]) {
            parent = r;
        }

        if (parent != index) {
            swap(index, parent);
            siftDown(parent);
        }
    }

    @Override
    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = 0;
        size--;
        siftDown(0);
        return max;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int peekMax() {
        if (isEmpty()) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }

    @Override
    public String toString() {
        return "MyMaxHeapImpl{" +
                "heap=" + Arrays.toString(heap) +
                ", capacity=" + capacity +
                ", size=" + size +
                '}';
    }
}
