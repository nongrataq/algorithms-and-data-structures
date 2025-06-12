package patterns.structural.decorator.circle;

public class BorderCircle extends CircleAbstractDecorator {
    public BorderCircle(Circle circle) {
        super(circle);
    }

    @Override
    public void draw() {
        circle.draw();
        System.out.println("with border");
    }

}
