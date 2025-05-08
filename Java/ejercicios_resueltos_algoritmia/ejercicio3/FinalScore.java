import java.util.Scanner;

public class FinalScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correct, incorrect, blank, scoreCorrect, scoreIncorrect, finalScore;
        // Operación
        System.out.print("Ingrese el número de respuestas correctas: ");
        correct = scanner.nextInt();
        System.out.print("Ingrese el número de respuestas incorrectas: ");
        incorrect = scanner.nextInt();
        System.out.print("Ingrese el número de respuestas en blanco: ");
        blank = scanner.nextInt();
        scoreCorrect = correct * 4;
        scoreIncorrect = incorrect * -1;
        finalScore = scoreCorrect + scoreIncorrect;
        // Mostrar resultado
        System.out.println("El puntaje final es: " + finalScore);
        scanner.close();
    }
} 