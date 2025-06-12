package patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        TestSingleton testSingleton = TestSingleton.getInstance();
        System.out.println(testSingleton);
        TestSingleton testSingleton2 = TestSingleton.getInstance();
        TestSingleton testSingleton3 = TestSingleton.getInstance();
        System.out.println(testSingleton2);
        System.out.println(testSingleton3);
        System.out.println(testSingleton2 == testSingleton3);
    }
}
