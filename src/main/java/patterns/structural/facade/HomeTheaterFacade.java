package patterns.structural.facade;

public class HomeTheaterFacade {
    private AudioSystem audio;
    private Projector projector;
    private LightController lights;
    private DVDPlayer dvd;

    public HomeTheaterFacade() {
        audio = new AudioSystem();
        projector = new Projector();
        lights = new LightController();
        dvd = new DVDPlayer();
    }

    // Простой метод для включения кинотеатра
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch " + movie);
        audio.on();
        projector.on();
        projector.setInput("DVD");
        lights.dim(50);
        dvd.on();
        dvd.play(movie);
    }

    // Метод для выключения всего
    public void endMovie() {
        System.out.println("Shutting down...");
        audio.off();
        projector.off();
        lights.dim(100);
        dvd.off();
    }

    public static void main(String[] args) {
        HomeTheaterFacade f = new HomeTheaterFacade();
        f.watchMovie("Бойцовский клуб");
    }
}
