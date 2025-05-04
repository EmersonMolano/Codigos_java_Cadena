import java.util.Scanner;

public class Seven_divisible_tres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero: ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println("El numero es divisible entre 3");
            }
        if (number % 3 != 0) {
            System.out.println("El numero no es divisible entre 3");
        }

        scanner.close();
    }
}
