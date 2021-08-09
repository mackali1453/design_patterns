package ObserverPattern;

public class Kemerhisar implements Observer {
    Subject subject;
    public Kemerhisar(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    public void update()
    {
        System.out.println(String.format("Kemerhisar'da %d dekar tarla %d bin TL'dir.",subject.getState(),subject.getState()*45000));
    } 
}
