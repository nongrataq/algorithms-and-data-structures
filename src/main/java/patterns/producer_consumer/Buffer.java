package patterns.producer_consumer;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    Queue<Integer> queue = new LinkedList<>();
    private static final int MAX_SIZE = 10;

    public synchronized void put(int value) throws InterruptedException {
        while (queue.size() == MAX_SIZE) {
            wait();
        }
        queue.add(value);
        System.out.println("добавил: " + value);
        notifyAll();
    }

    public synchronized void take() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }
        int value = queue.poll();
        System.out.println("сожрал: " + value);
        notifyAll();
    }

    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
