package patterns.creational.singleton;

import java.awt.*;

public class TestSingleton {
    private static TestSingleton INSTANCE;

    private TestSingleton() {}

    public void draw(Color color) {
        System.out.println("Нарисовал" + color + "цвет");
    }

    public static TestSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestSingleton();
        }
        return INSTANCE;
    }
}
