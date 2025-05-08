import java.util.Scanner;

public class VowelMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String vowel;
        // Operación
        System.out.print("Ingrese un número entero (1 a 5): ");
        number = scanner.nextInt();
        switch (number) {
            case 1: vowel = "A"; break;
            case 2: vowel = "E"; break;
            case 3: vowel = "I"; break;
            case 4: vowel = "O"; break;
            case 5: vowel = "U"; break;
            default: vowel = "Valor Incorrecto";
        }
        // Mostrar resultado
        System.out.println("La vocal correspondiente es: " + vowel);
        scanner.close();
    }
} 