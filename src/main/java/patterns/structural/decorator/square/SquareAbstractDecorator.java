package patterns.structural.decorator.square;

public abstract class SquareAbstractDecorator extends Square {
    protected Square square;

    public SquareAbstractDecorator(Square square) {
        this.square = square;
    }
}
