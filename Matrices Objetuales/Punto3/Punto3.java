public class Punto3 {

    public void P3(int d) {
        Metodos m = new Metodos();
        ObjLibros[][] matrizLibros = m.llenarMatrizLibros(d);
        m.mostrarMatriz(matrizLibros);
        ObjLibros libroMasCaro = m.encontrarLibroMasCaro(matrizLibros);
        System.out.println("El libro más caro es:");
        System.out.println("Título: " + libroMasCaro.getTitulo());
        System.out.println("Autor: " + libroMasCaro.getAutor());
        System.out.println("Precio: " + libroMasCaro.getPrecio());
    }
}