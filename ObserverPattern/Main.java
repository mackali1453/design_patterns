package ObserverPattern;

public class Main {
    public static void main(String[] args)

{
    Subject subject = new Subject();

    new Kemerhisar(subject);
    new Ulukisla(subject);

    subject.setState(150);
    
}
}
