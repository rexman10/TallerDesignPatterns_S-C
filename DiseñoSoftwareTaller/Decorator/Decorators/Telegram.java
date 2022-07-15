package DiseñoSoftwareTaller.Decorator.Decorators;

import DiseñoSoftwareTaller.Decorator.Implements.Decorator;
import DiseñoSoftwareTaller.Decorator.Implements.Notification;

public class Telegram extends Decorator
{
    public Telegram(Notification notify)
    {
        super( notify );
    }

    public String notificar()
    {
        notifyTelegram();
        return super.notificar() + notifyTelegram();
    }

    public String notifyTelegram()
    {
        // System.out.print(", Telegram");
        return ", Telegram";
    }
}
