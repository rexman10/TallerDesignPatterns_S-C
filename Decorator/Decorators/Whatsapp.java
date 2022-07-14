package Decorators;

import Implements.Decorator;
import Implements.Notification;

public class Whatsapp extends Decorator
{
    public Whatsapp(Notification notify)
    {
        super( notify );
    }

    public String notificar()
    {
        notifyWhatsapp();
        return super.notificar() + notifyWhatsapp();
    }

    public String notifyWhatsapp()
    {
        // System.out.print(", Whatsapp");
        return ", Whatsapp";
    }
}
