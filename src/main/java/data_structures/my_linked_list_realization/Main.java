package data_structures.my_linked_list_realization;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedListImpl<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        Iterator<Integer> it = myLinkedList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
