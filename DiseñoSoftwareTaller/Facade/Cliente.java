package DiseñoSoftwareTaller.Facade;


public class Cliente {
    String name;

    public Cliente(String name){
        this.name = name;
    }

    public void opcionesWeb(String opcion) {
        System.out.println("El cliente " + this.name + " accede al sistema web");
        PlataformaTienda.opcionWeb(opcion);
    }

    public void opcionesMovil(String opcion) {
        System.out.println("El cliente " + this.name + " accede al sistema movil");
        PlataformaTienda.opcionMovil(opcion);
    }

    public void opcionesTelef() {
        System.out.println("El cliente " + this.name + " accede al sistema telefonico");
        PlataformaTienda.opcionTelef();
    }
}
