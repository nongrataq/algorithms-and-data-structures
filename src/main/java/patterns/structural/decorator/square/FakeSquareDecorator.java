package patterns.structural.decorator.square;

public class FakeSquareDecorator extends SquareAbstractDecorator {
    public FakeSquareDecorator(Square square) {
        super(square);
    }
    @Override
    public void draw() {
        square.draw();
        System.out.println("fake square decorator");
    }

}
