package patterns.behavioral.strategy.cars;

import patterns.behavioral.strategy.HybridFillStrategy;

public class Truck extends Auto {
    public Truck() {
        super(new HybridFillStrategy());
    }
}
