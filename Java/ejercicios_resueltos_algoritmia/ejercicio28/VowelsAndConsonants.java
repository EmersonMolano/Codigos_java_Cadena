import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vowels = 0, consonants = 0, k = 1;
        char letter;
        // Operación
        while (k <= 10) {
            System.out.print("Ingrese una letra: ");
            letter = scanner.next().toLowerCase().charAt(0);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                vowels++;
            } else {
                consonants++;
            }
            k++;
        }
        // Mostrar resultado
        System.out.println("Número de vocales: " + vowels);
        System.out.println("Número de consonantes: " + consonants);
        scanner.close();
    }
} 