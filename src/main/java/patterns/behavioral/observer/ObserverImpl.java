package patterns.behavioral.observer;

public class ObserverImpl<T> implements Observer<T> {

    @Override
    public void update(T news) {
        System.out.println(news);
    }
}
