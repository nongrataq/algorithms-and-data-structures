package patterns.structural.bridge;

import patterns.structural.bridge.colors.BlackColor;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(new BlackColor());
        shape.draw();
    }
}
