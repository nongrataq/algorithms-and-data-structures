package patterns.structural.decorator.circle;

import patterns.structural.decorator.Shape;

public class Circle extends Shape {

    @Override
    protected void draw() {
        System.out.println("Drawing circle");
    }
}
