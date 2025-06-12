package patterns.creational.abstract_factory;

public interface GUIFactory {
    Button createButton();
    TextField createTextField();
    Select createSelect();
}
