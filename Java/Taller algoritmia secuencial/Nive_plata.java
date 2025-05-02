import java.util.Scanner;

public class Nive_plata {

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuanta plata tienes?: ");
        int number = scanner.nextInt();

        int cien = number / 100;
        number %= 100;

        int cincuenta = number / 50;
        number %= 50;

        int veinte = number / 20;
        number %= 20;

        int díes = number / 10;
        number %= 10;

        int cinco = number / 5;
        number %= 5;

        System.out.println("Desglose: ");
        System.out.println("Billetes de 100: " + cien);
        System.out.println("Billetes de 50: " + cincuenta);
        System.out.println("Billetes de 20: " + veinte);
        System.out.println("Billetes de 10: " + díes);
        System.out.println("Billetes de 5: " + cinco);
        System.out.println("Billetes de 1: " + number);

        scanner.close();
    }

}
