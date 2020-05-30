package observer.pull;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}

class AObserver extends Observer{
    // 这里Observer注册了Subject，为了是通过subject从中拉消息，这是一种拉模式
    // 当然也可以不用注册Subject，而是仅由Subject推消息过来，这是推模式
    public AObserver(Subject s){
        this.subject = s;
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + " receive " + subject.getState());
    }
}