public class Punto4 {

    public void P4(int d) {
        Metodos m = new Metodos();
        ObjTeatro[][] matrizAsientos = m.llenarMatrizAsientos(d);
        System.out.println("Matriz de asientos antes de ordenar:");
        m.mostrarMatriz(matrizAsientos);
        m.ordenarAsientosPorPrecio(matrizAsientos);
        System.out.println("Matriz de asientos después de ordenar:");
        m.mostrarMatriz(matrizAsientos);
    }
}