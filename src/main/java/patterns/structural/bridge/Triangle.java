package patterns.structural.bridge;

import patterns.structural.bridge.colors.Color;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Triangle " + " draw");
        color.fillColor();
    }
}
