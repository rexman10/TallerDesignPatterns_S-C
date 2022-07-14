package Decorators;

import Implements.Decorator;
import Implements.Notification;

public class Wire extends Decorator
{
    public Wire(Notification notify)
    {
        super( notify );
    }

    public String notificar()
    {
        notifyWire();
        return super.notificar() + notifyWire();
    }

    private String notifyWire()
    {
        // System.out.print(", Wire");
        return ", Wire";
    }
}
