import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    
    public ObjAlmacen[] llenarArrayProductos(int cantidad) {
        ObjAlmacen[] productos = new ObjAlmacen[cantidad];
        for (int i = 0; i < cantidad; i++) {
            ObjAlmacen producto = new ObjAlmacen();
            System.out.println("Ingrese el nombre del producto:");
            producto.setNombre(sc.next());
            System.out.println("Ingrese el peso del producto:");
            producto.setPeso(sc.nextDouble());
            System.out.println("Ingrese la categoría del producto:");
            producto.setCategoria(sc.next());
            productos[i] = producto;
        }
        return productos;
    }

    
    public int contarCategoriasUnicas(ObjAlmacen[] productos) {
        int contador = 0;
        String[] categorias = new String[productos.length];
        for (ObjAlmacen producto : productos) {
            boolean existe = false;
            for (int i = 0; i < contador; i++) {
                if (categorias[i].equals(producto.getCategoria())) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                categorias[contador] = producto.getCategoria();
                contador++;
            }
        }
        return contador;
    }

    
    public ObjAlmacen[][] agruparProductosPorCategoria(ObjAlmacen[] productos, int numCategorias) {
        ObjAlmacen[][] productosPorCategoria = new ObjAlmacen[numCategorias][productos.length];
        int[] contadores = new int[numCategorias];
        String[] categorias = new String[numCategorias];
        int index = 0;

        
        for (ObjAlmacen producto : productos) {
            boolean existe = false;
            for (int i = 0; i < index; i++) {
                if (categorias[i].equals(producto.getCategoria())) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                categorias[index] = producto.getCategoria();
                index++;
            }
        }

       
        for (ObjAlmacen producto : productos) {
            for (int i = 0; i < numCategorias; i++) {
                if (categorias[i].equals(producto.getCategoria())) {
                    productosPorCategoria[i][contadores[i]] = producto;
                    contadores[i]++;
                    break;
                }
            }
        }

        return productosPorCategoria;
    }

  
    public ObjAlmacen[][] llenarMatrizEstanterias(ObjAlmacen[][] productosPorCategoria, int dimension) {
        ObjAlmacen[][] matriz = new ObjAlmacen[dimension][dimension];
        int fila = 0, columna = 0;

        for (ObjAlmacen[] categoria : productosPorCategoria) {
            for (ObjAlmacen producto : categoria) {
                if (producto != null && fila < dimension && columna < dimension) {
                    matriz[fila][columna] = producto;
                    columna++;
                    if (columna == dimension) {
                        columna = 0;
                        fila++;
                    }
                }
            }
        }

        return matriz;
    }

    public void mostrarMatriz(ObjAlmacen[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != null) { 
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Peso: " + m[i][j].getPeso());
                    System.out.println("Categoría: " + m[i][j].getCategoria());
                }
            }
            System.out.println();
        }
    }
}