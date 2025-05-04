import java.util.Scanner;

public class One_mayor_edad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cual es tu edad?: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Eres mayor de edad, puedes votar");
        } else {
            System.out.println("No mayor de edad, no puedes votar");
        }

        scanner.close();
    }
    
}