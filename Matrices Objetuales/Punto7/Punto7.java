public class Punto7 {

    public void P7(int d) {
        Metodos m = new Metodos();
        System.out.println("Llenar matriz de estudiantes:");
        ObjCalificaciones[][] matrizEstudiantes = m.llenarMatrizEstudiantes(d);

        System.out.println("Matriz original:");
        m.mostrarMatriz(matrizEstudiantes, "Matriz de estudiantes");

        ObjCalificaciones[][][] matricesAgrupadas = m.agruparEstudiantesPorCalificacion(matrizEstudiantes);

        System.out.println("Estudiantes con calificación A:");
        m.mostrarMatriz(matricesAgrupadas[0], "Calificación A");

        System.out.println("Estudiantes con calificación B:");
        m.mostrarMatriz(matricesAgrupadas[1], "Calificación B");

        System.out.println("Estudiantes con calificación C:");
        m.mostrarMatriz(matricesAgrupadas[2], "Calificación C");

        System.out.println("Estudiantes con calificación D:");
        m.mostrarMatriz(matricesAgrupadas[3], "Calificación D");

        System.out.println("Estudiantes con calificación F:");
        m.mostrarMatriz(matricesAgrupadas[4], "Calificación F");
    }
}