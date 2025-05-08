import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String message;
        // Operación
        System.out.print("Ingrese un número entero diferente de cero: ");
        number = scanner.nextInt();
        if (number % 2 == 0) {
            message = "Es Par";
        } else {
            message = "Es Impar";
        }
        // Mostrar resultado
        System.out.println(message);
        scanner.close();
    }
} 