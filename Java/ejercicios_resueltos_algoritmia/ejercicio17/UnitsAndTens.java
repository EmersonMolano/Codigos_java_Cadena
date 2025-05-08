import java.util.Scanner;

public class UnitsAndTens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, tens, units;
        // Operación
        System.out.print("Ingrese un número entero de dos cifras: ");
        number = scanner.nextInt();
        tens = number / 10;
        units = number % 10;
        // Mostrar resultado
        System.out.println("Decenas: " + tens);
        System.out.println("Unidades: " + units);
        scanner.close();
    }
} 