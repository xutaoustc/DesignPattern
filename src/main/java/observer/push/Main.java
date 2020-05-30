package observer.push;

public class Main {
    public static void main(String[] args) {
        SubjectPush s = new SubjectPush();
        ObserverPushMode o = new AObserverPushMode();
        s.attach(o);
        s.setState(2);
    }
}
