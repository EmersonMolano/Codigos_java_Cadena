import java.util.Scanner;

public class Five_par_impar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hola mundo :3:");
        double number = scanner.nextDouble();

        double result = number % 2;

        if (result == 0) {
            System.out.print("The number is even");
        }else{
            System.out.print("The number is odd");
        }

        scanner.close();
    }
    
}