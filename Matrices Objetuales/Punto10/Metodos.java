import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjProductos[][] llenarMatrizProductos(int dimension) {
        ObjProductos[][] matriz = new ObjProductos[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                ObjProductos producto = new ObjProductos();
                System.out.println("Ingrese el nombre del producto en la posición [" + i + "][" + j + "]:");
                producto.setNombre(sc.next());
                System.out.println("Ingrese el peso del producto:");
                producto.setPeso(sc.nextDouble());
                System.out.println("Ingrese la categoría del producto:");
                producto.setCategoria(sc.next());
                System.out.println("¿El producto está en oferta? (true/false):");
                producto.setEnOferta(sc.nextBoolean());
                matriz[i][j] = producto;
            }
        }
        return matriz;
    }

    public int contarProductosEnOferta(ObjProductos[][] matriz) {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].isEnOferta()) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public void mostrarMatriz(ObjProductos[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                ObjProductos producto = matriz[i][j];
                System.out.println("Producto en [" + i + "][" + j + "]:");
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Peso: " + producto.getPeso());
                System.out.println("Categoría: " + producto.getCategoria());
                System.out.println("En oferta: " + producto.isEnOferta());
                System.out.println();
            }
        }
    }
}