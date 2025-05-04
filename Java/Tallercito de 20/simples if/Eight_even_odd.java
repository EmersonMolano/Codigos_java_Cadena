import java.util.Scanner;

public class Eight_even_odd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("El numero es par");
        }
        if (number % 2 != 0) { 
            System.out.println("El numero es impar");
        }

        scanner.close();
    }
}
