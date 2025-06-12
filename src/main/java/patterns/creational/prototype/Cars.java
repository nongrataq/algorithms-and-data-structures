package patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cars implements Cloneable {
    int speed;
    int cost;
    String color;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
