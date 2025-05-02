import java.util.Scanner;

public class Three_AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base del triángulo
        System.out.print("Ingresa la base del triángulo: ");
        double base = scanner.nextDouble();

        // Solicitar la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calcular el área
        double area = (base * altura) / 2;

        // Mostrar el resultado
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }
}
