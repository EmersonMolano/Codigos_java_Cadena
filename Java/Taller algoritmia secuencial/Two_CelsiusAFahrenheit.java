import java.util.Scanner;

public class Two_CelsiusAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la temperatura en grados Celsius
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcular la temperatura en Fahrenheit
        double fahrenheit = celsius * 9 / 5 + 32;

        // Mostrar el resultado
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}
