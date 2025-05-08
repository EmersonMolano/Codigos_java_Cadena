import java.util.Scanner;

public class AverageSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employees, k = 1;
        double salary, sum = 0, average;
        // Operación
        System.out.print("Ingrese el número de empleados: ");
        employees = scanner.nextInt();
        while (k <= employees) {
            System.out.print("Ingrese el sueldo del empleado " + k + ": ");
            salary = scanner.nextDouble();
            sum += salary;
            k++;
        }
        average = sum / employees;
        // Mostrar resultado
        System.out.println("El sueldo promedio es: " + average);
        scanner.close();
    }
} 