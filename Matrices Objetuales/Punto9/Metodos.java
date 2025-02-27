import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjVentas[] llenarDatosVendedores(int numVendedores, int meses) {
        ObjVentas[] vendedores = new ObjVentas[numVendedores];
        for (int i = 0; i < numVendedores; i++) {
            System.out.println("Ingrese el nombre del vendedor " + (i + 1) + ":");
            String nombre = sc.next();
            ObjVentas vendedor = new ObjVentas(nombre, meses);

            for (int j = 0; j < meses; j++) {
                System.out.println("Ingrese las ventas de " + nombre + " en el mes " + (j + 1) + ":");
                vendedor.getVentasMensuales()[j] = sc.nextDouble();
            }

            vendedores[i] = vendedor;
        }
        return vendedores;
    }

    public void calcularVendedorConMasVentas(ObjVentas[] vendedores) {
        double maxVentas = 0;
        ObjVentas vendedorConMasVentas = null;

        for (ObjVentas vendedor : vendedores) {
            double totalVentas = vendedor.calcularTotalVentas();
            if (totalVentas > maxVentas) {
                maxVentas = totalVentas;
                vendedorConMasVentas = vendedor;
            }
        }

        if (vendedorConMasVentas != null) {
            System.out.println("El vendedor que más vendió fue: " + vendedorConMasVentas.getNombreVendedor());
            System.out.println("Total de ventas: " + maxVentas);
        } else {
            System.out.println("No se encontraron vendedores.");
        }
    }
}