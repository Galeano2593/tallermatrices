public class Punto8 {

    public void P8(int d) {
        Metodos m = new Metodos();
        System.out.println("Ingrese la cantidad de productos:");
        int cantidad = m.sc.nextInt();

        System.out.println("Llenar array de productos:");
        ObjAlmacen[] productos = m.llenarArrayProductos(cantidad);

        System.out.println("Agrupar productos por categoría:");
        int numCategorias = m.contarCategoriasUnicas(productos);
        ObjAlmacen[][] productosPorCategoria = m.agruparProductosPorCategoria(productos, numCategorias);

        System.out.println("Llenar matriz de estanterías:");
        ObjAlmacen[][] matrizEstanterias = m.llenarMatrizEstanterias(productosPorCategoria, d);

        System.out.println("Matriz de estanterías:");
        m.mostrarMatriz(matrizEstanterias);
    }
}