public class Punto6 {

    public void P6(int d) {
        Metodos m = new Metodos();
        System.out.println("Llenar matriz de productos:");
        ObjSupermercado[][] matrizProductos = m.llenarMatrizProductos(d);

        System.out.println("Matriz original:");
        m.mostrarMatriz(matrizProductos);

        ObjSupermercado[][] matrizDisponibles = m.filtrarProductosDisponibles(matrizProductos);
        System.out.println("Matriz de productos disponibles:");
        m.mostrarMatriz(matrizDisponibles);
    }
}