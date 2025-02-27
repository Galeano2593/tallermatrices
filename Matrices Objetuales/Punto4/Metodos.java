import java.util.Scanner;


public class Metodos { Scanner sc = new Scanner(System.in);

    public ObjTeatro[][] llenarMatrizAsientos(int dimension) {
        ObjTeatro[][] m = new ObjTeatro[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjTeatro asiento = new ObjTeatro();
                System.out.println("Ingrese el número del asiento:");
                asiento.setNumero(sc.nextInt());
                System.out.println("Ingrese la fila del asiento:");
                asiento.setFila(sc.nextInt());
                System.out.println("Ingrese el precio del asiento:");
                asiento.setPrecio(sc.nextDouble());
                m[i][j] = asiento;
            }
        }
        return m;
    }

    public void mostrarMatriz(ObjTeatro[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Número: " + m[i][j].getNumero());
                System.out.println("Fila: " + m[i][j].getFila());
                System.out.println("Precio: " + m[i][j].getPrecio());
            }
            System.out.println();
        }
    }

    public void ordenarAsientosPorPrecio(ObjTeatro[][] m) {
        for (ObjTeatro[] fila : m) {
            boolean ordenado;
            do {
                ordenado = true;
                for (int i = 0; i < fila.length - 1; i++) {
                    if (fila[i].getPrecio() > fila[i + 1].getPrecio()) {
                        ObjTeatro temp = fila[i];
                        fila[i] = fila[i + 1];
                        fila[i + 1] = temp;
                        ordenado = false;
                    }
                }
            } while (!ordenado);
        }
    
    } }