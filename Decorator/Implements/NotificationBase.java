package Implements;

import Decorators.Signal;
import Decorators.Telegram;
import Decorators.Whatsapp;

public class NotificationBase implements Notification
{
    @Override
    public String notificar()
    {
        // System.out.print("Notificado por: SMS, Correo");
        return "Notificado por: SMS, Correo";
    }

    public static void main(String[] args)
    {
        NotificationBase eduard = new NotificationBase();
        
        Notification eduard1 = new Signal(eduard);
        Notification eduard2 = new Whatsapp(eduard1);
        Notification eduard3= new Telegram(eduard2);
        
        String eduardMsg = eduard3.notificar();

        System.out.println(eduardMsg);
    }
}
