import java.util.Scanner;

public class Two_positivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("El numero es positivo");
        } else if (number < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        scanner.close();
    }
}
