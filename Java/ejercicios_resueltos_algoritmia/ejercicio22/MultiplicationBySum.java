import java.util.Scanner;

public class MultiplicationBySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, k, product = 0;
        // Operación
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        for (k = 1; k <= num2; k++) {
            product += num1;
        }
        // Mostrar resultado
        System.out.println("El producto es: " + product);
        scanner.close();
    }
} 