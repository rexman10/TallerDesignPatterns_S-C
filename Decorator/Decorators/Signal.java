package Decorators;

import Implements.Decorator;
import Implements.Notification;

public class Signal extends Decorator
{
    //Constructor
    public Signal(Notification notify)
    {
        super( notify );
    }

    public String notificar()
    {
        notifySignal();
        return super.notificar() + notifySignal();
    }

    private String notifySignal()
    {
        // System.out.print(", Signal");
        return ", Signal";
    }
}
