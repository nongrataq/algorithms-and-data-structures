package patterns.behavioral.strategy.cars;

import patterns.behavioral.strategy.HybridFillStrategy;

public class Sedan extends Auto {
    public Sedan() {
        super(new HybridFillStrategy());
    }
}
