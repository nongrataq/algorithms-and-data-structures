package patterns.structural.adapter;

public class CurrencyAdapter {
    private static final double DOLLAR_TO_RUBLE_RATE = 79.0;
    private static final double RUBLE_TO_DOLLAR_RATE = 1.0 / DOLLAR_TO_RUBLE_RATE;

    public Dollars toDollars(Rubles rubles) {
        return new Dollars(rubles.getAmount() * RUBLE_TO_DOLLAR_RATE);
    }

    public Rubles toRubles(Dollars dollars) {
        return new Rubles(dollars.getAmount() * DOLLAR_TO_RUBLE_RATE);
    }
}
