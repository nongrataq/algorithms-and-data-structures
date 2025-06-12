package patterns.creational.abstract_factory;

public class WindowsGUIFactory implements GUIFactory {

    public WindowsGUIFactory() {
        System.out.println("Creating gui factory for Windows OS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for Windows OS");
        return new WindowsButton();
    }
    @Override
    public TextField createTextField() {
        System.out.println("Creating TextField for Windows OS");
        return new WindowsTextField();
    }
    @Override
    public Select createSelect() {
        System.out.println("Creating Select for Windows OS");
        return new WindowsSelect();
    }
}
