package patterns.behavioral.strategy.cars;

import patterns.behavioral.strategy.F1PitstopStrategy;

public class F1Car extends Auto {
    public F1Car() {
        super(new F1PitstopStrategy());
    }
}
