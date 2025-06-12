package patterns.behavioral.observer;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Subject<News> subject = new SubjectImpl<>();

        ObserverImpl<News> observer = new ObserverImpl<>();

        subject.registerObserver(observer);

        News event = new News("Москва", LocalDateTime.now());

        subject.notifyObservers(event);

    }
}
