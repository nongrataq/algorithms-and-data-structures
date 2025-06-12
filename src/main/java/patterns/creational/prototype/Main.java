package patterns.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cars cars = new Cars(300, 20000000, "Red");
        Cars cars1 = (Cars) cars.clone();
        System.out.println(cars);
        System.out.println(cars.equals(cars));


    }
}
