public class Punto10 {

    public void P10(int dimension) {
        Metodos m = new Metodos();

        System.out.println("Llenar matriz de productos:");
        ObjProductos[][] matrizProductos = m.llenarMatrizProductos(dimension);

        System.out.println("Mostrar matriz de productos:");
        m.mostrarMatriz(matrizProductos);

        int productosEnOferta = m.contarProductosEnOferta(matrizProductos);
        System.out.println("Total de productos en oferta: " + productosEnOferta);
    }
}