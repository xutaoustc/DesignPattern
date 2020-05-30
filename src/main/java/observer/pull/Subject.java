package observer.pull;

import java.util.ArrayList;
import java.util.List;

// 不论用推拉模式，将Observer（观察者）注入到Subject都是必须的
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    private void notifyObservers(){
        observers.stream().forEach(Observer::update);
    }
}
