package patterns.behavioral.strategy;

import patterns.behavioral.strategy.cars.Auto;
import patterns.behavioral.strategy.cars.F1Car;
import patterns.behavioral.strategy.cars.Sedan;
import patterns.behavioral.strategy.cars.ToyCar;

public class Main {

    public static void main(String[] args) {

        Auto toyCar = new ToyCar();
        Auto sedan = new Sedan();
        Auto f1car = new F1Car();

        sedan.fill();
        toyCar.fill();
        f1car.fill();
    }
}

