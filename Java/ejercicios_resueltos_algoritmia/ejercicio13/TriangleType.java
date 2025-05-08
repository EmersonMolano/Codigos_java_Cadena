import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1, side2, side3;
        String type;
        // Operación
        System.out.print("Ingrese el primer lado: ");
        side1 = scanner.nextInt();
        System.out.print("Ingrese el segundo lado: ");
        side2 = scanner.nextInt();
        System.out.print("Ingrese el tercer lado: ");
        side3 = scanner.nextInt();
        if (side1 != side2 && side2 != side3 && side1 != side3) {
            type = "Escaleno";
        } else if (side1 == side2 && side2 == side3) {
            type = "Equilátero";
        } else {
            type = "Isósceles";
        }
        // Mostrar resultado
        System.out.println("Tipo de triángulo: " + type);
        scanner.close();
    }
} 