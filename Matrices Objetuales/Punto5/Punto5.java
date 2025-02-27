public class Punto5 {

    public void P5(int d) {
        Metodos m = new Metodos();
        System.out.println("Llenar matriz de productos para la Tienda 1:");
        ObjProducto[][] matrizTienda1 = m.llenarMatrizProductos(d);
        System.out.println("Llenar matriz de productos para la Tienda 2:");
        ObjProducto[][] matrizTienda2 = m.llenarMatrizProductos(d);

        System.out.println("Matriz de la Tienda 1:");
        m.mostrarMatriz(matrizTienda1);
        System.out.println("Matriz de la Tienda 2:");
        m.mostrarMatriz(matrizTienda2);

        ObjProducto[][] matrizFusionada = m.fusionarMatrices(matrizTienda1, matrizTienda2);
        System.out.println("Matriz fusionada:");
        m.mostrarMatriz(matrizFusionada);
    }
}