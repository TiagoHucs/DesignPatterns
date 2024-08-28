package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

class Satellite implements Subject{
    List<Observer> observers = new ArrayList<>();
    String alert;
    String name;

    public Satellite(String name) {
        this.name = name;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers){
            o.update(this.alert);
        }
    }

    public void setAlert(String s){
        this.alert = s;
        notifyObservers();
    }
}
