package patterns.structural.decorator.square;

import patterns.structural.decorator.Shape;

public class Square extends Shape {

    @Override
    protected void draw() {
        System.out.println("Drawing square");
    }
}
