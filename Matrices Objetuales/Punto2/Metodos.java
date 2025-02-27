import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

    public ObjTienda[][] llenarMatrizTienda(int dimension) {
        ObjTienda[][] m = new ObjTienda[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjTienda o = new ObjTienda();
                System.out.println("Ingrese la marca");
                o.setMarca(sc.next());
                System.out.println("ingrese la cantidad del producto");
                o.setCantidad(sc.nextInt());
                m[i][j] = o;
            }
        }
        return m;

    }

    public void mostrarMatriz(ObjTienda[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Marca: " + m[i][j].getMarca());
                System.out.println("Cantidad: " + m[i][j].getCantidad());
            }
            System.out.println();
        }
    }
    public int SumarCantidades(ObjTienda[][] m) {
        int suma = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                suma = suma + m[i][j].getCantidad();
            }
        }
        return suma;
    }
}
    
       
    

