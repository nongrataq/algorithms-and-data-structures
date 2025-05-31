package data_structures.my_linked_list_realization;

import java.util.Iterator;

public interface MyLinkedList<E> {
    void add(E element);
    E get(int index);
    E remove(int index);
    int size();
    boolean isEmpty();
    E getFirst();
    E getLast();
    void clear();
    Iterator<E> iterator();
}
