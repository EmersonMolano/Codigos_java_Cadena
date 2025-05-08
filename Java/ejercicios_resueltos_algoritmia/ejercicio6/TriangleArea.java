import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sideA, sideB, sideC, semiPerimeter, area;
        // Operación
        System.out.print("Ingrese la longitud del lado A: ");
        sideA = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado B: ");
        sideB = scanner.nextDouble();
        System.out.print("Ingrese la longitud del lado C: ");
        sideC = scanner.nextDouble();
        semiPerimeter = (sideA + sideB + sideC) / 2;
        area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        // Mostrar resultado
        System.out.println("El área del triángulo es: " + area);
        scanner.close();
    }
} 