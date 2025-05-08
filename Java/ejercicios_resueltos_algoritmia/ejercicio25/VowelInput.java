import java.util.Scanner;

public class VowelInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter;
        boolean isVowel = false;
        // Operación
        do {
            System.out.print("Ingrese una letra: ");
            letter = scanner.next().toLowerCase().charAt(0);
            isVowel = (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u');
        } while (!isVowel);
        // Mostrar resultado
        System.out.println("Ingresó una vocal: " + letter);
        scanner.close();
    }
} 