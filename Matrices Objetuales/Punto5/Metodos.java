import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

  
    public ObjProducto[][] llenarMatrizProductos(int dimension) {
        ObjProducto[][] m = new ObjProducto[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjProducto producto = new ObjProducto();
                System.out.println("Ingrese el nombre del producto:");
                producto.setNombre(sc.next());
                System.out.println("Ingrese el precio del producto:");
                producto.setPrecio(sc.nextDouble());
                System.out.println("Ingrese el stock del producto:");
                producto.setStock(sc.nextInt());
                m[i][j] = producto;
            }
        }
        return m;
    }

    
    public void mostrarMatriz(ObjProducto[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != null) { 
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Precio: " + m[i][j].getPrecio());
                    System.out.println("Stock: " + m[i][j].getStock());
                }
            }
            System.out.println();
        }
    }

   
    public ObjProducto[][] fusionarMatrices(ObjProducto[][] m1, ObjProducto[][] m2) {
        int dimension = m1.length;
        ObjProducto[][] matrizResultante = new ObjProducto[dimension * 2][dimension * 2]; 
        int contador = 0; 

       
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrizResultante[contador / dimension][contador % dimension] = m1[i][j];
                contador++;
            }
        }

        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                ObjProducto producto2 = m2[i][j];
                boolean encontrado = false;

                
                for (int k = 0; k < contador; k++) {
                    ObjProducto producto1 = matrizResultante[k / dimension][k % dimension];
                    if (producto1.equals(producto2)) {
                        producto1.setStock(producto1.getStock() + producto2.getStock()); 
                        encontrado = true;
                        break;
                    }
                }

               
                if (!encontrado) {
                    matrizResultante[contador / dimension][contador % dimension] = producto2;
                    contador++;
                }
            }
        }

        return matrizResultante;
    }
}