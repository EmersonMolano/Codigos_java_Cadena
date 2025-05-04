import java.util.Scanner;

public class Six_multipo_cinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero: ");
        int number = scanner.nextInt();

        if (number % 5 == 0) {
            System.out.println("El numero es multiplo de 5");
        } 
        if (number % 5 != 0) {
            System.out.println("El numero no es multiplo de 5");
        }

        scanner.close();
    }


}
