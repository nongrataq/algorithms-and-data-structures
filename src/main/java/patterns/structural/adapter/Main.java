package patterns.structural.adapter;

import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        CurrencyAdapter adapter = new CurrencyAdapter();
        OutputStreamWriter out = new OutputStreamWriter(System.out);
        Rubles rubles = new Rubles(100);
        Dollars dollars = adapter.toDollars(rubles);
        System.out.println(dollars.getAmount());

        Dollars usd = new Dollars(50);
        Rubles convertedRubles = adapter.toRubles(usd);
        System.out.println(convertedRubles.getAmount());
    }
}