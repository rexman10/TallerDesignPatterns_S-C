package DiseñoSoftwareTaller;

public class LegacyTienda {
    
    public static void Catalogo(){
        System.out.println("Se hace proceso de revisar catalogo");
        revisarCatalogo();
    }
    private static void revisarCatalogo() {
        System.out.println("Revisando catalogo");
    }


    public static void Compra() {
        System.out.println("Se hace proceso de compra");
        realizarCompra();
    }
    private static void realizarCompra() {
        System.out.println("Compra realizada con exito");
    }


    public static void Reserva() {
        System.out.println("Se hace proceso de reserva");
        reservarArticulo();
    }
    private static void reservarArticulo(){
        System.out.println("Se ha reservado el articulo");
    }


    public static void Consulta() {
        System.out.println("Se hace proceso de atencion al cliente");
        realizarConsulta();
    }
    private static void realizarConsulta() {
        System.out.println("Llamando a atencion al cliente");
    }


    public static void Devolucion() {
        System.out.println("Se hace proceso de devolucion");
        devolverArticulo();
    }
    private static void devolverArticulo() {
        System.out.println("Se ha devolvido el artiiculo");
    }

}
