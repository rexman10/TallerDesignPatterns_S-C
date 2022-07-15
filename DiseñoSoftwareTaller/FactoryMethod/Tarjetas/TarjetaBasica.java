package DiseñoSoftwareTaller.FactoryMethod.Tarjetas;

public class TarjetaBasica implements Tarjeta{
    private int costoAnual;
    private int limiteCredito;

    public TarjetaBasica(){
        
    }
    
    @Override
    public void generarTarjeta(int sueldo) {
        this.costoAnual = 30;
        this.limiteCredito = sueldo/3;
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
