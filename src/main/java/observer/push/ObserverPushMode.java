package observer.push;

public abstract class ObserverPushMode {
    public abstract void update(String info);
}

class AObserverPushMode extends ObserverPushMode{
    @Override
    public void update(String info) {
        System.out.println(this.getClass().getName() + " receive " + info);
    }
}