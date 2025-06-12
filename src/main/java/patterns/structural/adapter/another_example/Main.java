package patterns.structural.adapter.another_example;

public class Main {
    public static void main(String[] args) {
        USB cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUSB();
    }
}
