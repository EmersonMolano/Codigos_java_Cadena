import java.util.Scanner;

public class SalesBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sales, bonus = 0;
        // Operación
        System.out.print("Ingrese el monto de venta: ");
        sales = scanner.nextDouble();
        if (sales >= 0 && sales < 1000) {
            bonus = 0;
        } else if (sales >= 1000 && sales < 5000) {
            bonus = (3 * sales) / 100;
        } else if (sales >= 5000 && sales < 20000) {
            bonus = (5 * sales) / 100;
        } else if (sales >= 20000) {
            bonus = (8 * sales) / 100;
        }
        // Mostrar resultado
        System.out.println("La bonificación es: " + bonus);
        scanner.close();
    }
} 