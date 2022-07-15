package DiseñoSoftwareTaller.FactoryMethod.Modelo;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos");
        c1.solicitarTarjeta(1200);
        String coste = String.valueOf(c1.getTarjeta().getCostoAnual());
        String limit = String.valueOf(c1.getTarjeta().getLimiteCredito());

        System.out.println("El cliente " + c1.getName() + " con tarjeta de coste anual: " + coste + " dolares y limite crediticio de: " + limit + " dolares");

        Cliente c2 = new Cliente("Jose");
        c2.solicitarTarjeta(2500);
        String coste2 = String.valueOf(c2.getTarjeta().getCostoAnual());
        String limit2 = String.valueOf(c2.getTarjeta().getLimiteCredito());

        System.out.println("El cliente " + c2.getName() + " con tarjeta de coste anual: " + coste2 + " dolares y limite crediticio de: " + limit2 + " dolares");
    }
}
