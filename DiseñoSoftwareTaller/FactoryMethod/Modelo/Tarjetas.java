package DiseñoSoftwareTaller.FactoryMethod.Modelo;

import DiseñoSoftwareTaller.FactoryMethod.Tarjetas.*;

public class Tarjetas {
    public static Tarjeta crearTarjeta(int sueldo){

        Tarjeta nueva = null;

        if (sueldo > 0 && sueldo <= 1400){
            Tarjeta temp = new TarjetaBasica();
            temp.generarTarjeta(sueldo);
            nueva = temp;
        }
        else if (sueldo > 1400 && sueldo <= 2700){
            Tarjeta premium = new TarjetaPremium();
            premium.generarTarjeta(sueldo);
            nueva = premium;
        }
        else {
            Tarjeta vip = new TarjetaVIP();
            vip.generarTarjeta(sueldo);
            nueva = vip; 
        }
        return nueva;
    }
}
