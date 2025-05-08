import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, max;
        // Operación
        System.out.print("Ingrese el primer número entero: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        num2 = scanner.nextInt();
        System.out.print("Ingrese el tercer número entero: ");
        num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        // Mostrar resultado
        System.out.println("El número mayor es: " + max);
        scanner.close();
    }
} 