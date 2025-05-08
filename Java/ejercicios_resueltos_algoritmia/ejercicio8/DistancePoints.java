import java.util.Scanner;

public class DistancePoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double xA, xB, yA, yB, distance;
        // Operación
        System.out.print("Ingrese la abscisa de A: ");
        xA = scanner.nextDouble();
        System.out.print("Ingrese la abscisa de B: ");
        xB = scanner.nextDouble();
        System.out.print("Ingrese la ordenada de A: ");
        yA = scanner.nextDouble();
        System.out.print("Ingrese la ordenada de B: ");
        yB = scanner.nextDouble();
        distance = Math.sqrt(Math.pow(xB - xA, 2) + Math.pow(yB - yA, 2));
        // Mostrar resultado
        System.out.println("La distancia entre A y B es: " + distance);
        scanner.close();
    }
} 