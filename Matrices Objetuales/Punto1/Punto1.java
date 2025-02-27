public class Punto1 {

    public void P1(int d) {
        Metodos m = new Metodos();
        Producto[][] M = new Producto[d][d];
        M = m.llenarMatriz(d);
        m.mostrarMatriz(M);
        System.out.println(m.MostrarposicionElemento(M));
    }
}