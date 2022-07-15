package DiseñoSoftwareTaller.FactoryMethod.Modelo;

import DiseñoSoftwareTaller.FactoryMethod.Tarjetas.Tarjeta;

public class Cliente {
    private String name;
    private Tarjeta tarjeta;

    public Cliente(String name) {
        this.tarjeta = null;
        this.name = name;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void solicitarTarjeta(int sueldo){
        this.tarjeta = Tarjetas.crearTarjeta(sueldo);
    }    
}
