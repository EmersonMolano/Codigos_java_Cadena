import java.util.Scanner;

public class SimpleAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade1, grade2, grade3, average;
        // Operación
        System.out.print("Ingrese la primera nota: ");
        grade1 = scanner.nextDouble();
        System.out.print("Ingrese la segunda nota: ");
        grade2 = scanner.nextDouble();
        System.out.print("Ingrese la tercera nota: ");
        grade3 = scanner.nextDouble();
        average = (grade1 + grade2 + grade3) / 3;
        // Mostrar resultado
        System.out.println("El promedio es: " + average);
        scanner.close();
    }
} 