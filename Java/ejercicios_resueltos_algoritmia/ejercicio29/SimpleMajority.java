import java.util.Scanner;

public class SimpleMajority {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k, vote, c1 = 0, c2 = 0, c3 = 0, c0 = 0, winner;
        // Operación
        for (k = 1; k <= 160; k++) {
            System.out.print("Ingrese el voto del elector (1, 2, 3, otro): ");
            vote = scanner.nextInt();
            switch (vote) {
                case 1: c1++; break;
                case 2: c2++; break;
                case 3: c3++; break;
                default: c0++;
            }
        }
        // Mostrar resultado
        if (c1 > c2 && c1 > c3 && c1 > c0) {
            winner = 1;
        } else if (c2 > c3 && c2 > c0) {
            winner = 2;
        } else if (c3 > c0) {
            winner = 3;
        } else {
            winner = 0;
        }
        System.out.println("El ganador es el candidato: " + winner);
        scanner.close();
    }
} 