package patterns.structural.decorator.circle;

public class RedCircle extends CircleAbstractDecorator {

    public RedCircle(Circle circle) {
        super(circle);
    }

    @Override
    public void draw() {
        circle.draw();
        System.out.println("red color");
    }
}
