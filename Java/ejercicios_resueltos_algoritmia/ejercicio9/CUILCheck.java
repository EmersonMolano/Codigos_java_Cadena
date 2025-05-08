import java.util.Scanner;

public class CUILCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int birthYear, currentYear, age;
        // Operación
        System.out.print("Ingrese el año de nacimiento: ");
        birthYear = scanner.nextInt();
        System.out.print("Ingrese el año actual: ");
        currentYear = scanner.nextInt();
        age = currentYear - birthYear;
        // Mostrar resultado
        if (age > 17) {
            System.out.println("Debe solicitar su CUIL");
        } else {
            System.out.println("No debe solicitar su CUIL aún");
        }
        scanner.close();
    }
} 