package DiseñoSoftwareTaller.Facade;

public class PlataformaTienda {
    public static void opcionWeb(String opcion){
        if (opcion.equals("catalogo")){
            LegacyTienda.Catalogo();
        }
        if (opcion.equals("compra")) {
            LegacyTienda.Compra();
        }
    }
    public static void opcionMovil(String opcion){
        if (opcion.equals("reserva")) {
            LegacyTienda.Reserva();
        }
        if (opcion.equals("devolucion")) {
            LegacyTienda.Devolucion();
        }
        
    }
    public static void opcionTelef(){
        LegacyTienda.Consulta();
    }
}
