import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjLibros[][] llenarMatrizLibros(int dimension) {
        ObjLibros[][] m = new ObjLibros[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjLibros libro = new ObjLibros();
                System.out.println("Ingrese el título del libro:");
                libro.setTitulo(sc.next());
                System.out.println("Ingrese el autor del libro:");
                libro.setAutor(sc.next());
                System.out.println("Ingrese el precio del libro:");
                libro.setPrecio(sc.nextDouble());
                m[i][j] = libro;
            }
        }
        return m;
    }

    public void mostrarMatriz(ObjLibros[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Título: " + m[i][j].getTitulo());
                System.out.println("Autor: " + m[i][j].getAutor());
                System.out.println("Precio: " + m[i][j].getPrecio());
            }
            System.out.println();
        }
    }

    public ObjLibros encontrarLibroMasCaro(ObjLibros[][] m) {
        ObjLibros libroMasCaro = m[0][0];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getPrecio() > libroMasCaro.getPrecio()) {
                    libroMasCaro = m[i][j];
                }
            }
        }
        return libroMasCaro;
    }
}