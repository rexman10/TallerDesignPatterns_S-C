package DiseñoSoftwareTaller;

import DiseñoSoftwareTaller.LegacyTienda;

public class PlataformaTienda {
    public static void opcionesWeb(String opcion){
        if (opcion.equals("catalogo")){
            LegacyTienda.Catalogo();
        }
        if (opcion.equals("compra")) {
            LegacyTienda.Compra();
        }
    }
    public static void opcionesMovil(String opcion){
        if (opcion.equals("reserva")) {
            LegacyTienda.Reserva();
        }
        if (opcion.equals("devolucion")) {
            LegacyTienda.Devolucion();
        }
        
    }
    public static void opcionesTelef(){
        LegacyTienda.Consulta();
    }
}
