package DiseñoSoftwareTaller.Facade;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Cesar");
        c1.opcionesMovil("reserva");
        c1.opcionesWeb("compra");

        Cliente c2 = new Cliente("Sergio");
        c2.opcionesTelef();
    }  
}
