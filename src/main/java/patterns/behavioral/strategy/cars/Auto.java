package patterns.behavioral.strategy.cars;

import patterns.behavioral.strategy.FillStrategy;

public class Auto {
    private final FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void gas() { System.out.println("По газам"); }
    public void stop() {
        System.out.println("Stooppp!!!");
    }
    public void fill() {
        fillStrategy.fill();
    }
}

