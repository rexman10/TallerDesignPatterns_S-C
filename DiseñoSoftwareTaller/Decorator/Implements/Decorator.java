package DiseñoSoftwareTaller.Decorator.Implements;

public abstract class Decorator implements Notification
{
    private Notification notify;

    public Decorator(Notification notify)
    {
        this.notify = notify;
    }

    @Override
    public String notificar()
    {
        return notify.notificar();
    }
    
}
