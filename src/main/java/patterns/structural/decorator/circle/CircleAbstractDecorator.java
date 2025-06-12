package patterns.structural.decorator.circle;

abstract public class CircleAbstractDecorator extends Circle {
    protected Circle circle;

    public CircleAbstractDecorator(Circle circle) {
        this.circle = circle;
    }
}
