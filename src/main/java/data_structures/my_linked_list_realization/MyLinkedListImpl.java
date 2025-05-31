package data_structures.my_linked_list_realization;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkedListImpl<E> implements MyLinkedList<E>, Iterable<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    public MyLinkedListImpl() {
    }

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(null, element, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    @Override
    public E getLast() {
        return tail.item;
    }

    @Override
    public E getFirst() {
        return head.item;
    }

    @Override
    public E remove(int index) {
        E removedItem;
        if (index == 0) {
            removedItem = head.item;
            head = head.next;
            if (head == null) {
                tail = null;
            } else {
                head.previous = null;
            }
        } else {
            Node<E> pr = head;
            for (int i = 0; i < index - 1; i++) {
                pr = pr.next;
            }
            removedItem = pr.next.item;

            if (index == size - 1) {
                tail = pr;
                pr.next = null;
            } else {
                pr.next = pr.next.next;
                pr.next.previous = pr;
            }
        }
        size--;
        return removedItem;
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
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }
    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                return null;
            }
            E item = current.item;
            current = current.next;
            return item;
        }
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> previous;
        public Node(Node<E> previous, E item, Node<E> next) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<E> current = head;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) sb.append(", ");
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
