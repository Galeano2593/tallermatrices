public class Punto9 {

    public void P9(int d) {
        Metodos m = new Metodos();
        int numVendedores = 5;
        int meses = 12;

        System.out.println("Llenar datos de vendedores y sus ventas:");
        ObjVentas[] vendedores = m.llenarDatosVendedores(numVendedores, meses);

        System.out.println("Calcular el vendedor con más ventas:");
        m.calcularVendedorConMasVentas(vendedores);
    }
}