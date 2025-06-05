package data_structures.my_hashMap_realization;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MyMap<Integer, String> hashMap = new MyHashMap<>();
        Integer i = 10;
        System.out.println(i);
        hashMap.put(1, "#");
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.remove(1));
        System.out.println(hashMap.get(1));
    }
}
