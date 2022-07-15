package DiseñoSoftwareTaller.Decorator.Decorators;

import DiseñoSoftwareTaller.Decorator.Implements.Decorator;
import DiseñoSoftwareTaller.Decorator.Implements.Notification;

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
