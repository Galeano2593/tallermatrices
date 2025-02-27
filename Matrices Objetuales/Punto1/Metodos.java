import java.util.Scanner;

public class Metodos {
     Scanner sc = new Scanner(System.in);

    public Producto[][] llenarMatriz(int dimension) {
        Producto[][] m = new Producto[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                Producto o = new Producto();
                System.out.println("Ingrese el nombre del producto");
                o.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto");
                o.setPrecio(sc.nextDouble());
                System.out.println("ingrese la cantidad del producto");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;

    }

    public void mostrarMatriz(Producto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Nombre: " + m[i][j].getNombre());
                System.out.println("Precio: " + m[i][j].getPrecio());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
            }
            System.out.println();
        }
    }

    public String MostrarposicionElemento(Producto[][] m) {
        String nombreBuscar = "";
        System.out.println("Ingrese el nombre del prooducto a buscar");
        nombreBuscar = sc.next();
        String result = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j].getNombre().toLowerCase().equals(nombreBuscar)) {
                    result += "el producto se encuentra en la posicion: " + (i + 1) + "," + (j + 1
                    ) + "\n";
                }
            }
        }
        return result;
    }
    
}
