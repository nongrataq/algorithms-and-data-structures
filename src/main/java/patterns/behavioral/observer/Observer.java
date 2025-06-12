package patterns.behavioral.observer;

public interface Observer<T> {
    void update(T news);
}