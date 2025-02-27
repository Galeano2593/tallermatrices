import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int dimension = 0;
        System.out.println("Ingrese la dimension de la matriz");
        dimension = sc.nextInt();
        System.out.println("Ingrese la opcion que desea realizar");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Punto1 objP1 = new Punto1();
                objP1.P1(dimension);
                break;
        
            default:
                break;
        }
    }
    
}
