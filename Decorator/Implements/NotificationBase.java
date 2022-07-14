package Implements;

public class NotificationBase implements Notification
{
    @Override
    public String notificar()
    {
        // System.out.print("Notificado por: SMS, Correo");
        return "SMS, Correo";
    }
}
