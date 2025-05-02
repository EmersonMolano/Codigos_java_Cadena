import java.util.Scanner;

public class Six_intercambio {
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primer número: ");
        double numberOne = scanner.nextDouble();

        System.out.print("Segundo número: ");
        double numberTwo = scanner.nextDouble();

        System.out.println("Antes del, intercambio numberOne, "+ numberOne + ", numberTwo, " + numberTwo + ".");

        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;

        System.out.println("Después del intercambio: numberOne, " + numberOne + ", numberTwo = " + numberTwo);

        scanner.close();

    }
}