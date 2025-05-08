import java.util.Scanner;

public class AgeCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, minors = 0, adults = 0, k = 1;
        // Operación
        while (k <= 200) {
            System.out.print("Ingrese la edad de la persona " + k + ": ");
            age = scanner.nextInt();
            if (age < 18) {
                minors++;
            } else {
                adults++;
            }
            k++;
        }
        // Mostrar resultado
        System.out.println("Mayores de edad: " + adults);
        System.out.println("Menores de edad: " + minors);
        scanner.close();
    }
} 