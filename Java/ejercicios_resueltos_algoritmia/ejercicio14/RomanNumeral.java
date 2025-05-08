import java.util.Scanner;

public class RomanNumeral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String roman = "";
        // Operación
        System.out.print("Ingrese un número entero (1 a 10): ");
        number = scanner.nextInt();
        switch (number) {
            case 1: roman = "I"; break;
            case 2: roman = "II"; break;
            case 3: roman = "III"; break;
            case 4: roman = "IV"; break;
            case 5: roman = "V"; break;
            case 6: roman = "VI"; break;
            case 7: roman = "VII"; break;
            case 8: roman = "VIII"; break;
            case 9: roman = "IX"; break;
            case 10: roman = "X"; break;
            default: roman = "Valor incorrecto";
        }
        // Mostrar resultado
        System.out.println("Equivalente en romano: " + roman);
        scanner.close();
    }
} 