import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, k;
        // Operación
        System.out.print("Ingrese un número entero diferente de cero: ");
        number = scanner.nextInt();
        System.out.println("Los divisores de " + number + " son:");
        for (k = 1; k <= Math.abs(number); k++) {
            if (number % k == 0) {
                System.out.println(k);
            }
        }
        // Mostrar resultado (ya se muestran en el ciclo)
        scanner.close();
    }
} 