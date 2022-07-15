
public class Main
{
    public static void main(String[] args)
    {
        //Creacion de clientes
        Client karen = new Client("Karen");
        karen.useWhatsapp();

        Client fabricsio = new Client("Fabricsio");
        fabricsio.useWhatsapp();
        fabricsio.useTelegram();

        Client zaida = new Client("Zaida");
        zaida.useWhatsapp();
        zaida.useSignal();
        zaida.useWire();

        System.out.println( karen.getNotifications() );
        System.out.println( fabricsio.getNotifications() );
        System.out.println( zaida.getNotifications() );

        
    }    
}
