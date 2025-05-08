import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month;
        String name;
        // Operación
        System.out.print("Ingrese el número del mes (1-12): ");
        month = scanner.nextInt();
        switch (month) {
            case 1: name = "Enero"; break;
            case 2: name = "Febrero"; break;
            case 3: name = "Marzo"; break;
            case 4: name = "Abril"; break;
            case 5: name = "Mayo"; break;
            case 6: name = "Junio"; break;
            case 7: name = "Julio"; break;
            case 8: name = "Agosto"; break;
            case 9: name = "Septiembre"; break;
            case 10: name = "Octubre"; break;
            case 11: name = "Noviembre"; break;
            case 12: name = "Diciembre"; break;
            default: name = "Mes inválido";
        }
        // Mostrar resultado
        System.out.println("El mes es: " + name);
        scanner.close();
    }
} 