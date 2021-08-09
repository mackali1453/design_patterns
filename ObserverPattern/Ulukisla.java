package ObserverPattern;

public class Ulukisla implements Observer {
    Subject subject;
    public Ulukisla(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update()
    {
        System.out.println(String.format("Ulukisla'da %d dekar tarla %d bin TL'dir.",subject.getState(),subject.getState()*15000));
    } 
}
