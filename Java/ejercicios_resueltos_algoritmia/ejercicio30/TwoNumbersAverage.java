import java.util.Scanner;

public class TwoNumbersAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, sum, average;
        // Operación
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
        sum = num1 + num2;
        average = sum / 2;
        // Mostrar resultado
        System.out.println("El promedio es: " + average);
        scanner.close();
    }
} 