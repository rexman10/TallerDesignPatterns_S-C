import Decorators.Signal;
import Decorators.Telegram;
import Decorators.Whatsapp;
import Decorators.Wire;
import Implements.Notification;
import Implements.NotificationBase;

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
