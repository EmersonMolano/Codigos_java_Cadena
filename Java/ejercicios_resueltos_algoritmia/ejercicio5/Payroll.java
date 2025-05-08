import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hours, rate, payroll;
        // Operación
        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        hours = scanner.nextDouble();
        System.out.print("Ingrese la tarifa por hora: ");
        rate = scanner.nextDouble();
        payroll = hours * rate;
        // Mostrar resultado
        System.out.println("La planilla es: " + payroll);
        scanner.close();
    }
} 