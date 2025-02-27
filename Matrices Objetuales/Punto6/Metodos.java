import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    
    public ObjSupermercado[][] llenarMatrizProductos(int dimension) {
        ObjSupermercado[][] m = new ObjSupermercado[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjSupermercado producto = new ObjSupermercado();
                System.out.println("Ingrese el nombre del producto:");
                producto.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto:");
                producto.setPrecio(sc.nextDouble());
                System.out.println("Ingrese la disponibilidad del producto (true/false):");
                producto.setDisponibilidad(sc.nextBoolean());
                m[i][j] = producto;
            }
        }
        return m;
    }

  
    public void mostrarMatriz(ObjSupermercado[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != null) { 
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Precio: " + m[i][j].getPrecio());
                    System.out.println("Disponibilidad: " + m[i][j].isDisponibilidad());
                }
            }
            System.out.println();
        }
    }


    public ObjSupermercado[][] filtrarProductosDisponibles(ObjSupermercado[][] m) {
        int dimension = m.length;
        ObjSupermercado[][] matrizFiltrada = new ObjSupermercado[dimension][dimension];
        int fila = 0, columna = 0;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (m[i][j].isDisponibilidad()) {
                    matrizFiltrada[fila][columna] = m[i][j];
                    columna++;
                    if (columna == dimension) {
                        columna = 0;
                        fila++;
                    }
                }
            }
        }

        return matrizFiltrada;
    }
}