import java.util.Scanner;

public class BrothersAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age1, age2, diff;
        // Operación
        System.out.print("Ingrese la edad del primer hermano: ");
        age1 = scanner.nextInt();
        System.out.print("Ingrese la edad del segundo hermano: ");
        age2 = scanner.nextInt();
        if (age1 > age2) {
            System.out.println("El primer hermano es el mayor, por " + (age1 - age2) + " años");
            diff = age1 - age2;
        } else {
            System.out.println("El segundo hermano es el mayor, por " + (age2 - age1) + " años");
            diff = age2 - age1;
        }
        // Mostrar diferencia
        System.out.println("Diferencia de edades: " + diff);
        scanner.close();
    }
} 