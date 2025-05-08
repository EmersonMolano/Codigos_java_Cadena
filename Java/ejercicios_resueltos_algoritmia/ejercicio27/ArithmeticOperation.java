import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result = 0;
        char op;
        // Operación
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Ingrese el operador (+, -, *, ^): ");
        op = scanner.next().charAt(0);
        switch (op) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '^': result = (int)Math.pow(num1, num2); break;
            default: result = 0;
        }
        // Mostrar resultado
        System.out.println("El resultado es: " + result);
        scanner.close();
    }
} 