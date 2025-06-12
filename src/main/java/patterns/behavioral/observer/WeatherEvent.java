package patterns.behavioral.observer;

public class WeatherEvent {
    private String city;
    private int temperature;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public WeatherEvent(String city, int temperature) {
        this.city = city;
        this.temperature = temperature;
    }
}
