import java.util.Scanner;

public class Three_evenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        scanner.close();
    }
}
