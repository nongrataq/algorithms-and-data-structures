package patterns.creational.abstract_factory;

public class OrderCoffeeForm {
    private final TextField customerNameTextField;
    private final Select customerTypeSelect;
    private final Button orderButton;

    public OrderCoffeeForm(GUIFactory factory) {
        System.out.println("Creating order coffee form");
        customerNameTextField = factory.createTextField();
        customerTypeSelect = factory.createSelect();
        orderButton = factory.createButton();
    }
}
