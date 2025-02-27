import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dimension = 0;
        System.out.println("Ingrese la dimension de la matriz");
        while (!sc.hasNextInt()) {
            System.out.println("La dimension debe ser un numero entero");
            sc.next();
        }
        dimension = sc.nextInt();
        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese la opcion que desea realizar");
            while (!sc.hasNextInt()) {
                System.out.println("La opcion debe ser un numero entero");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    Punto7 objP7 = new Punto7();
                    objP7.P7(dimension);
                    break;
                default:
                    System.out.println("Hasta pronto");
                    continuar = false;
                    break;
            }
        }
    }
}