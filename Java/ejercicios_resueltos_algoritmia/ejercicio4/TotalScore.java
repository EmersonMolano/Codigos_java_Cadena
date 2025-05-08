import java.util.Scanner;

public class TotalScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int win, draw, lose, scoreWin, scoreDraw, totalScore;
        // Operación
        System.out.print("Ingrese el número de partidos ganados: ");
        win = scanner.nextInt();
        System.out.print("Ingrese el número de partidos empatados: ");
        draw = scanner.nextInt();
        System.out.print("Ingrese el número de partidos perdidos: ");
        lose = scanner.nextInt();
        scoreWin = win * 3;
        scoreDraw = draw * 1;
        totalScore = scoreWin + scoreDraw;
        // Mostrar resultado
        System.out.println("El puntaje total es: " + totalScore);
        scanner.close();
    }
} 