package patterns.structural.facade;

class AudioSystem {
    void on() { System.out.println("Audio ON"); }
    void off() { System.out.println("Audio OFF"); }
}

class Projector {
    void on() { System.out.println("Projector ON"); }
    void off() { System.out.println("Projector OFF"); }
    void setInput(String source) { System.out.println("Input: " + source); }
}

class LightController {
    void dim(int level) { System.out.println("Lights dimmed to " + level + "%"); }
}

class DVDPlayer {
    void on() { System.out.println("DVD ON"); }
    void play(String movie) { System.out.println("Playing: " + movie); }
    void off() { System.out.println("DVD OFF"); }
}
