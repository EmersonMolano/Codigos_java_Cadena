import java.util.Scanner;

public class One_sumaDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma
        double suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de los dos números es: " + suma);

        scanner.close();
    }
}