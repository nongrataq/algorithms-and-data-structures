package patterns.structural.bridge.colors;

public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("red");
    }
}
