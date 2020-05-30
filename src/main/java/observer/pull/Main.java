package observer.pull;

public class Main {
    public static void main(String[] args) {
        Subject s = new Subject();
        Observer o = new AObserver(s);
        s.attach(o);
        s.setState(1);
    }
}
