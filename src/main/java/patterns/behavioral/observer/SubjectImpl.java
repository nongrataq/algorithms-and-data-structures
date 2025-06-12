package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl<T> implements Subject<T> {
    private final List<Observer<T>> observerList;

    public SubjectImpl() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer<T> observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer<T> observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(T event) {
        for (Observer<T> observer : observerList) {
            observer.update(event);
        }
    }
}
