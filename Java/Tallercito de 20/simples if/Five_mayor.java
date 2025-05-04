import java.util.Scanner;

public class Five_mayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca el primer numero: ");
        int age = scanner.nextInt();

        
        if (age >= 18){
            System.out.println("Eres mayor de edad");
        }
        if (age < 18){
            System.out.println("No eres mayor de edad");
        }

        scanner.close();
    }
    
}