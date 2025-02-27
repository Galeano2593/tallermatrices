import java.util.Scanner;

public class Metodos {
    Scanner sc = new Scanner(System.in);

   
    public ObjCalificaciones[][] llenarMatrizEstudiantes(int dimension) {
        ObjCalificaciones[][] m = new ObjCalificaciones[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                ObjCalificaciones estudiante = new ObjCalificaciones();
                System.out.println("Ingrese el nombre del estudiante:");
                estudiante.setNombre(sc.next());
                System.out.println("Ingrese la calificación del estudiante (A, B, C, etc.):");
                estudiante.setCalificacion(sc.next().charAt(0));
                m[i][j] = estudiante;
            }
        }
        return m;
    }

   
    public void mostrarMatriz(ObjCalificaciones[][] m, String titulo) {
        System.out.println(titulo + ":");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] != null) { 
                    System.out.println("Nombre: " + m[i][j].getNombre());
                    System.out.println("Calificación: " + m[i][j].getCalificacion());
                }
            }
            System.out.println();
        }
    }

    
    public ObjCalificaciones[][][] agruparEstudiantesPorCalificacion(ObjCalificaciones[][] m) {
        int dimension = m.length;
        ObjCalificaciones[][][] matricesAgrupadas = new ObjCalificaciones[5][dimension][dimension]; 
        int[] contadores = new int[5]; 

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                ObjCalificaciones estudiante = m[i][j];
                char calificacion = Character.toUpperCase(estudiante.getCalificacion());

                int indice = -1;
                switch (calificacion) {
                    case 'A':
                        indice = 0;
                        break;
                    case 'B':
                        indice = 1;
                        break;
                    case 'C':
                        indice = 2;
                        break;
                    case 'D':
                        indice = 3;
                        break;
                    case 'F':
                        indice = 4;
                        break;
                    default:
                        System.out.println("Calificación no válida: " + calificacion);
                        break;
                }

                if (indice != -1) {
                    int fila = contadores[indice] / dimension;
                    int columna = contadores[indice] % dimension;
                    matricesAgrupadas[indice][fila][columna] = estudiante;
                    contadores[indice]++;
                }
            }
        }

        return matricesAgrupadas;
    }
}