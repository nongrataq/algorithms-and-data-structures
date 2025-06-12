package patterns.structural.bridge;

import patterns.structural.bridge.colors.Color;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Circle draw");
        color.fillColor();
    }
}
