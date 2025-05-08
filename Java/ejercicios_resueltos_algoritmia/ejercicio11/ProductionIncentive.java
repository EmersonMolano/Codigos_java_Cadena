import java.util.Scanner;

public class ProductionIncentive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mon, tue, wed, thu, fri, sat, total;
        double average;
        // Operación
        System.out.print("Ingrese la producción del lunes: ");
        mon = scanner.nextInt();
        System.out.print("Ingrese la producción del martes: ");
        tue = scanner.nextInt();
        System.out.print("Ingrese la producción del miércoles: ");
        wed = scanner.nextInt();
        System.out.print("Ingrese la producción del jueves: ");
        thu = scanner.nextInt();
        System.out.print("Ingrese la producción del viernes: ");
        fri = scanner.nextInt();
        System.out.print("Ingrese la producción del sábado: ");
        sat = scanner.nextInt();
        total = mon + tue + wed + thu + fri + sat;
        average = total / 6.0;
        // Mostrar resultado
        if (average >= 100) {
            System.out.println("Recibirá Incentivos");
        } else {
            System.out.println("No Recibirá Incentivos");
        }
        scanner.close();
    }
} 