package DiseñoSoftwareTaller.FactoryMethod.Tarjetas;

public class TarjetaVIP implements Tarjeta{
    private int costoAnual;
    private int limiteCredito;

    public TarjetaVIP(){
        
    }
    
    @Override
    public void generarTarjeta(int sueldo) {
        this.costoAnual = 90;
        this.limiteCredito = 2*sueldo;
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
