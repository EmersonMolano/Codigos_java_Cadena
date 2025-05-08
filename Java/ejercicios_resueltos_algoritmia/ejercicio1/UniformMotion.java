import java.util.Scanner;

public class UniformMotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed, time, distance;
        // Operación
        System.out.print("Ingrese la velocidad constante (m/s): ");
        speed = scanner.nextDouble();
        System.out.print("Ingrese el tiempo (s): ");
        time = scanner.nextDouble();
        distance = speed * time;
        // Mostrar resultado
        System.out.println("Distancia recorrida: " + distance + " metros");
        scanner.close();
    }
} 