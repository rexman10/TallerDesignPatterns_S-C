package DiseñoSoftwareTaller;

import DiseñoSoftwareTaller.PlataformaTienda;


public class Cliente {

    public static void opcionesWeb(String opcion) {
        PlataformaTienda.opcionesWeb(opcion);
    }

    public static void opcionesMovil(String opcion) {
        PlataformaTienda.opcionesMovil(opcion);
    }

    public static void opcionesTelef() {
        PlataformaTienda.opcionesTelef();
    }

    public static void main(String[] args) {
        opcionesMovil("reserva");
        System.out.println();
        opcionesWeb("compra");
    }

    

    
}


