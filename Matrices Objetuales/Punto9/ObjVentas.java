public class ObjVentas {
    private String nombreVendedor;
    private double[] ventasMensuales;

    public ObjVentas(String nombreVendedor, int meses) {
        this.nombreVendedor = nombreVendedor;
        this.ventasMensuales = new double[meses];
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public double[] getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double[] ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public double calcularTotalVentas() {
        double total = 0;
        for (double venta : ventasMensuales) {
            total += venta;
        }
        return total;
    }
}