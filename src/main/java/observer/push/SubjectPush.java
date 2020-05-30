package observer.push;

import java.util.ArrayList;
import java.util.List;

public class SubjectPush {
    private List<ObserverPushMode> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public void attach(ObserverPushMode observer){
        observers.add(observer);
    }

    private void notifyObservers(){
        observers.stream().forEach(x->x.update(getState()+""));
    }
}
