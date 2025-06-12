package patterns.creational.factory_method;

public class Main {
    public static void main(String[] args) {
        BeelineStore centerBeelineStore = new CenterBeelineStore();
        IMobile samsung =  centerBeelineStore.orderPhone("samsung");
        IMobile iphone = centerBeelineStore.orderPhone("iphone");

    }
}
