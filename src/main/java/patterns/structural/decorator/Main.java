package patterns.structural.decorator;

import patterns.structural.decorator.circle.BorderCircle;
import patterns.structural.decorator.circle.Circle;
import patterns.structural.decorator.circle.RedCircle;
import patterns.structural.decorator.square.FakeSquareDecorator;
import patterns.structural.decorator.square.Square;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       Shape shape = new BorderCircle(new RedCircle(new Circle()));

       Shape shape2 = new FakeSquareDecorator(new Square());
       shape.draw();
       shape2.draw();
    }
}
