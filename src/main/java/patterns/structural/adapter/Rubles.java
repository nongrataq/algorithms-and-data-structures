package patterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rubles implements Currency{
    private double amount;
}
