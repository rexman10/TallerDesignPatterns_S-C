package DiseñoSoftwareTaller.FactoryMethod.Tarjetas;

public class TarjetaPremium implements Tarjeta {
    private int costoAnual;
    private int limiteCredito;

    public TarjetaPremium(){
        
    }
    
    @Override
    public void generarTarjeta(int sueldo) {
        this.costoAnual = 60;
        this.limiteCredito = sueldo/2;
    }

    public int getCostoAnual() {
        return this.costoAnual;
    }

    public void setCostoAnual(int costoAnual) {
        this.costoAnual = costoAnual;
    }

    public int getLimiteCredito() {
        return this.limiteCredito;
    }

    public void setLimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
}
