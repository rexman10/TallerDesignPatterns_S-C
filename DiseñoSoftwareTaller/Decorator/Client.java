package DiseñoSoftwareTaller.Decorator;

import DiseñoSoftwareTaller.Decorator.Decorators.Signal;
import DiseñoSoftwareTaller.Decorator.Decorators.Telegram;
import DiseñoSoftwareTaller.Decorator.Decorators.Whatsapp;
import DiseñoSoftwareTaller.Decorator.Decorators.Wire;
import DiseñoSoftwareTaller.Decorator.Implements.Notification;
import DiseñoSoftwareTaller.Decorator.Implements.NotificationBase;

public class Client
{
    private Notification notify;
    private String name;

    //Respetando principio builder
    public Client(String name)
    {
        this.notify = new NotificationBase();
        this.name = name;
    }

    //Setters -----------------------------------------------------------
    public void useSignal()
    {
        Notification signal = new Signal( this.notify );
        this.notify = signal;
    }

    public void useTelegram()
    {
        Notification telegram = new Telegram( this.notify );
        this.notify = telegram;
    }

    public void useWhatsapp()
    {
        Notification whatsapp = new Whatsapp( this.notify );
        this.notify = whatsapp;
    }

    public void useWire()
    {
        Notification wire = new Wire( this.notify );
        this.notify = wire;
    }

    public String getNotifications()
    {
        return "" + this.name + " sera notificado por: " + notify.notificar();
    }

}
