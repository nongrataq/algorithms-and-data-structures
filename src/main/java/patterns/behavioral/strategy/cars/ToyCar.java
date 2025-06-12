package patterns.behavioral.strategy.cars;

import patterns.behavioral.strategy.StandartFillStrategy;

public class ToyCar extends Auto {

    public ToyCar() {
        super(new StandartFillStrategy());
    }
}
